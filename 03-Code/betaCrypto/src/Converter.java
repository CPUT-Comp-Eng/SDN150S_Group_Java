/**
 This is Class for the Converter
 Code extends to be used in betaCrytpo
 
 */
package betaCrypto;
public class Converter {

    // Crypto Currency codes
    private String[] codes = {"BTC", "ETH", "USDT", "BNB", "SOL",
                              "XRP", "ADA", "DOGE", "USD", "ZAR"};
    // USD values of the crypto codes
    private double[] usdRates = {68000, 2500, 1, 600, 160,
                                 0.55, 0.40, 0.12, 1, 0.055};

    public String[] getCodes() {
        return codes;
    }
    // Loop for Finding USD rates of an code
    private double getRate(String code) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(code)) {
                return usdRates[i];
            }
        }
        return -1; // not found
    }

    //  Code for the conversion - one currency to another
    public double convert(double amount, String from, String to) {
        double fromRate = getRate(from);
        double toRate = getRate(to);
        double amountInUsd = amount * fromRate;
        double result = amountInUsd / toRate;
        return result;
    }
}