import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * SDN150S Mini Project: Crypto + Fiat Converter (Luno-style).
 * Markets: 10 crypto/crypto pairs, crypto/ZAR, crypto/USD, USD/ZAR.
 * Classes: RatePair (model), RateService (logic), CryptoConverter (GUI).
 */

// ---------- Model: one supported market ----------
class RatePair {
    private final String base;   // e.g. "BTC"
    private final String quote;  // e.g. "ZAR"

    // Constructor
    public RatePair(String base, String quote) {
        this.base = base;
        this.quote = quote;
    }

    public String getBase()  { return base; }
    public String getQuote() { return quote; }

    @Override
    public String toString() { return base + "/" + quote; }
}

// ---------- Logic: rates, markets, conversion ----------
class RateService {
    // Spread applied when either side is fiat (1%), similar to an exchange fee
    private static final double FIAT_SPREAD = 0.01;
    // Sample ZAR per 1 USD (replace with a live feed)
    private static final double ZAR_PER_USD = 18.00;

    // Value of 1 unit of each asset in USD (sample values)
    private final Map<String, Double> usdRates = new LinkedHashMap<>();
    private final List<RatePair> pairs = new ArrayList<>();

    // Constructor: loads rates and builds the market list
    public RateService() {
        usdRates.put("BTC", 67000.00);
        usdRates.put("ETH", 3200.00);
        usdRates.put("LTC", 85.00);
        usdRates.put("XRP", 0.55);
        usdRates.put("ADA", 0.45);
        usdRates.put("SOL", 150.00);
        usdRates.put("USD", 1.00);
        usdRates.put("ZAR", 1.00 / ZAR_PER_USD);

        // The 10 required crypto pairs
        String[][] cryptoPairs = {
            {"BTC", "ETH"}, {"BTC", "LTC"}, {"BTC", "XRP"}, {"BTC", "ADA"},
            {"BTC", "SOL"}, {"ETH", "LTC"}, {"ETH", "XRP"}, {"ETH", "ADA"},
            {"ETH", "SOL"}, {"LTC", "XRP"}
        };
        for (String[] p : cryptoPairs) {
            pairs.add(new RatePair(p[0], p[1]));
        }

        // Fiat markets: every crypto against ZAR and USD
        String[] coins = {"BTC", "ETH", "LTC", "XRP", "ADA", "SOL"};
        for (String coin : coins) {
            pairs.add(new RatePair(coin, "ZAR"));
            pairs.add(new RatePair(coin, "USD"));
        }
        pairs.add(new RatePair("USD", "ZAR"));
    }

    public RatePair[] getPairs() { return pairs.toArray(new RatePair[0]); }

    public boolean isFiat(String code) {
        return code.equals("ZAR") || code.equals("USD");
    }

    /** Number of decimals to display: 2 for fiat, 8 for crypto. */
    public int decimals(String code) {
        return isFiat(code) ? 2 : 8;
    }

    /** Converts amount of 'from' into 'to' using USD as the pivot. */
    public double convert(double amount, String from, String to) {
        Double fromUsd = usdRates.get(from);
        Double toUsd = usdRates.get(to);
        if (fromUsd == null || toUsd == null) {
            throw new IllegalArgumentException("Unsupported currency");
        }
        double result = amount * fromUsd / toUsd;

        // Apply spread on any fiat trade
        if (isFiat(from) || isFiat(to)) {
            result = result * (1.0 - FIAT_SPREAD);
        }
        return result;
    }
}

// ---------- GUI: Swing frame form ----------
public class CryptoConverter extends JFrame {
    private final RateService service = new RateService();
    private final JComboBox<RatePair> pairBox;
    private final JTextField amountField = new JTextField(12);
    private final JLabel directionLabel = new JLabel("  Direction: BASE -> QUOTE");
    private final JLabel rateLabel = new JLabel("  Rate: -");
    private final JLabel resultLabel = new JLabel("  Result: -");
    private boolean reversed = false;  // false = BASE -> QUOTE, true = QUOTE -> BASE

    // Constructor: builds the frame
    public CryptoConverter() {
        super("Crypto & Fiat Converter (BTC, ETH, LTC, XRP, ADA, SOL, ZAR, USD)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 8, 8));

        pairBox = new JComboBox<>(service.getPairs());
        JButton convertBtn = new JButton("Convert");
        JButton swapBtn = new JButton("Swap direction");
        JButton clearBtn = new JButton("Clear");

        add(new JLabel("  Market:"));
        add(pairBox);
        add(new JLabel("  Amount:"));
        add(amountField);
        add(swapBtn);
        add(convertBtn);
        add(clearBtn);
        add(new JLabel(""));
        add(new JLabel("  Info:"));
        add(directionLabel);
        add(new JLabel("  Price:"));
        add(rateLabel);
        add(new JLabel("  Output:"));
        add(resultLabel);

        // Event handlers
        convertBtn.addActionListener(this::onConvert);
        swapBtn.addActionListener(e -> {
            reversed = !reversed;
            updateDirectionLabel();
        });
        pairBox.addActionListener(e -> updateDirectionLabel());
        clearBtn.addActionListener(e -> {
            amountField.setText("");
            rateLabel.setText("  Rate: -");
            resultLabel.setText("  Result: -");
        });

        updateDirectionLabel();
        setSize(560, 380);
        setLocationRelativeTo(null);
    }

    /** Shows which currency is being converted into which. */
    private void updateDirectionLabel() {
        RatePair pair = (RatePair) pairBox.getSelectedItem();
        String from = reversed ? pair.getQuote() : pair.getBase();
        String to   = reversed ? pair.getBase()  : pair.getQuote();
        directionLabel.setText("  Direction: " + from + " -> " + to);
    }

    /** Validates input, converts, and shows the result. */
    private void onConvert(ActionEvent e) {
        String text = amountField.getText().trim();

        // Input validation (control statements)
        if (text.isEmpty()) {
            showError("Enter an amount.");
            return;
        }
        double amount;
        try {
            amount = Double.parseDouble(text);
        } catch (NumberFormatException ex) {
            showError("Amount must be a number.");
            return;
        }
        if (amount <= 0) {
            showError("Amount must be greater than zero.");
            return;
        }

        RatePair pair = (RatePair) pairBox.getSelectedItem();
        String from = reversed ? pair.getQuote() : pair.getBase();
        String to   = reversed ? pair.getBase()  : pair.getQuote();

        double result = service.convert(amount, from, to);
        double unitPrice = service.convert(1.0, from, to);

        rateLabel.setText(String.format("  1 %s = %." + service.decimals(to) + "f %s", from, unitPrice, to));
        resultLabel.setText(String.format("  %." + service.decimals(from) + "f %s = %." + service.decimals(to) + "f %s",
                amount, from, result, to));
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Input error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CryptoConverter().setVisible(true));
    }
}
