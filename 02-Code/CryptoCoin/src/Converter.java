/*
Description: Currency Converter computation
Authors: Garison Pieters (222535164)
         Etienne G. Roux (260041637) 
 */

public class Converter {
    
   // Constant Fiat-Crypto Codes
   private static final String[] CODES = {"BTC", "ETH", "BNB", "SOL","XRP",
                                           "ADA", "DOGE", "TRX","LINK","LTC", 
                                           "USD", "ZAR"};
 
    public String[] getCodes() {
        return CODES;
    }
    // Return Values for The Crypto - Ratio(Currency/USD = Return)
      private double getRate(String code) {
        switch (code) {
            // 10-Crypto-Currency
            case "BTC":  return 77962.69; // Bitcoin
            case "ETH":  return 2287.69; // Ethereum
            case "BNB":  return 702.63; // Binance Coin
            case "SOL":  return 94.50; // Solana
            case "XRP":  return 1.26;
            case "ADA":  return 0.40; //Cardano
            case "DOGE": return 0.12; // Dogecoin
            case "TRX": return 0.12; // TRON
            case "LINK": return 11.35; //Chainlink
            case "LTC": return 54.94;
            // 2-Fiat-Currency
            case "USD":  return 1;
            case "ZAR":  return 0.060;
            default:     return 1;
        }
    
    }


    //  Code for the conversion - one currency to another
    public double convert(double amount, String from, String to) {
            
        double inUsd = amount * getRate(from);   // change to USD
        double result = inUsd / getRate(to);     // change USD to the new currency
        return result;
    }
}