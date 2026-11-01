## Converter Class
> Converter.java File

```java
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
            
        double inUsd = amount * getRate(from);   // change to USD
        double result = inUsd / getRate(to);     // change USD to the new currency
        return result;
    }
}
```

## CryptoCoinUI
> CryptoCoinUI.java

### CryptoCoinUI() 

```java
  public CryptoCoinUI() {
        initComponents();
        populateCurrencyComboBoxes();
        EndValueTF.setEditable(false); // Conversion bar is non-editable
    }
```

### Combo Boxes 

```java
   private void populateCurrencyComboBoxes() {
        FromValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        ToValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        FromValueCB.setSelectedItem("ZAR");
        ToValueCB.setSelectedItem("USD");
    }
```
### Convert Button
```java
    private void ConvertBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            double amount = Double.parseDouble(InsertedValueTF.getText().trim());
            if (amount < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Amount cannot be negative.");
                return;
            }

            String from = (String) FromValueCB.getSelectedItem();
            String to = (String) ToValueCB.getSelectedItem();

            double result = converter.convert(amount, from, to);
            EndValueTF.setText(String.format("%.8f %s", result, to));

            double zar = converter.convert(amount, from, "ZAR");
            jZarLabel.setText(String.format("ZAR value: R %.2f", zar));

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
 
    }  
```


### Reset Button 
```java
   private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {                             
        InsertedValueTF.setText("");
        EndValueTF.setText("");
        jZarLabel.setText("ZAR value: -"); // Added
        FromValueCB.setSelectedItem("USD");
        ToValueCB.setSelectedItem("BTC");
        InsertedValueTF.requestFocus();
    }                                        
```

### Exit Button

```java
   private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int choice = javax.swing.JOptionPane.showConfirmDialog(this,
                "Exit the Converter?", "Confirm exit",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (choice == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }   
```
