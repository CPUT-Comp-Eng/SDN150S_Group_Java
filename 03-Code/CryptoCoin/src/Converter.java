/*
Description: Currency Converter computation
Authors: Garison Pieters (222535164)
         Etienne G. Roux (260041637) 
 */

public class Converter {
    
   // Constant Fiat-Crypto Codes
   private static final String[] CODES = {"BTC", "ETH", "USDT", "BNB", "SOL",
                                           "XRP", "ADA", "DOGE", "USD", "ZAR"};
 
    public String[] getCodes() {
        return CODES;
    }
    // Return Values for The Crypto - Ratio(Currency/USD = Return)
      private double getRate(String code) {
        switch (code) {
            case "BTC":  return 68000;
            case "ETH":  return 2500;
            case "USDT": return 1;
            case "BNB":  return 600;
            case "SOL":  return 160;
            case "XRP":  return 0.55;
            case "ADA":  return 0.40;
            case "DOGE": return 0.12;
            case "USD":  return 1;
            case "ZAR":  return 0.060;
            default:     return -1;
        }
    }


    //  Code for the conversion - one currency to another
    public double convert(double amount, String from, String to) {
        return amount * getRate(from) / getRate(to);
    }
}