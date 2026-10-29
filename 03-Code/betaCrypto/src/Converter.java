/**
 This is 
 */
package betaCrypto;
public class Converter {

    // Currency codes and their value in USD (example rates)
    private String[] codes = {"BTC", "ETH", "USDT", "BNB", "SOL",
                              "XRP", "ADA", "DOGE", "USD", "ZAR"};
    private double[] usdRates = {68000, 2500, 1, 600, 160,
                                 0.55, 0.40, 0.12, 1, 0.055};

    public String[] getCodes() {
        return codes;
    }

    // Finds the USD rate for a code by looping through the array
    private double getRate(String code) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(code)) {
                return usdRates[i];
            }
        }
        return -1; // not found
    }

    // Convert amount from one currency to another (via USD)
    public double convert(double amount, String from, String to) {
        double fromRate = getRate(from);
        double toRate = getRate(to);
        double amountInUsd = amount * fromRate;
        double result = amountInUsd / toRate;
        return result;
    }
}