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
This class does the maths. It has no buttons or windows.

1. `CODES`: Variable name for the array of 10 currencies (2 Fiat and 8 Crypto). 
	- `static final` makes `CODES` a constant
2. `getCodes()`: lets other classes read the list, since the array is `private`.
3. `getRate(code)`: returns the USD value of 1 unit of that currency. 
	- for example 1 BTC = 68000 USD.
4. `default: return -1`: returned for an unknown code.
5.  `convert(...)`: converts through USD in two steps.
	- Amount × rate of `from` gives USD.
	- USD ÷ rate of `to` gives the result.

 **Example**: 1 ETH to BTC = (1 × 2500) ÷ 68000 = 0.03676471.

**Limitations:**
- The currency values are fixed.
- Crypto prices are highly volatile, so the rates would need constant updating. Adding live prices from an API would make this much closer to the converter feature in an app like Luno.

## CryptoCoinUI
> CryptoCoinUI.java

This class is the window. It handles clicks and asks `Converter` for the maths.
### Constants
```java
public class CryptoCoinUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CryptoCoinUI.class.getName());
    private final Converter converter = new Converter();
```

1. `CryptoCoinUI extends javax.swing.JFrame `: makes this class a window.
2. `logger`: records error messages (used in `main`).
3. `converter`: the `Converter` object the window uses for all calculations.
### CryptoCoinUI() 
```java
  public CryptoCoinUI() {
        initComponents();
        populateCurrencyComboBoxes();
        EndValueTF.setEditable(false); // Conversion bar is non-editable
    }
```

1. Constructor: runs once when the window is created.
2. `initComponents()`: NetBeans-generated code that builds the buttons, boxes and labels.
3. `populateCurrencyComboBoxes()`: fills the dropdowns.
4. `setEditable(false)`: the result box is read-only.
### Combo Boxes 
```java
   private void populateCurrencyComboBoxes() {
        FromValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        ToValueCB.setModel(new javax.swing.DefaultComboBoxModel<>(converter.getCodes()));
        FromValueCB.setSelectedItem("USD");
        ToValueCB.setSelectedItem("BTC");
    }
```

1. A combo box is a dropdown. There is one for From and one for To.
2. `setModel(...)`: loads the 10 codes into each dropdown.
3. `setSelectedItem(...)`: sets the starting selection to USD → BTC.
### InsertedValueTF
> Inserted Value Text Field
```java
    private void InsertedValueTFActionPerformed(java.awt.event.ActionEvent evt) {                  
        ConvertBtnActionPerformed(evt);
    }   
```

1. Runs when the user presses Enter in the amount box.
2. Calls the Convert button’s method, so Enter works the same as clicking Convert.
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

Runs when Convert is clicked.
1. `getText().trim()`: reads the typed text and removes extra spaces.
2. `Double.parseDouble(...)`: converts the text to a number. Non-numbers throw a `NumberFormatException`.
3. Negative check: shows a warning and `return` stops the method.
4. `getSelectedItem()`: reads the chosen currencies from the dropdowns.
5. `converter.convert(...)`: calculates the result.
6. `EndValueTF.setText(String.format("%.8f %s", result, to));`: shows 8 decimal places, since crypto amounts can be very small.
7. ` jZarLabel.setText(String.format("ZAR value: R %.2f", zar));`: converts the same amount to ZAR and shows 2 decimals.
8. `try / catch`: invalid input shows a message instead of crashing.
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

1. Clears the amount and result boxes.
2. Sets the ZAR label back to `ZAR value: -`.
3. Sets the dropdowns back to the startup selection, USD → BTC.
4. `requestFocus()`: puts the cursor back in the amount box.
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

1. `int choice`: stores the button the user clicked, as an integer code.
2. `javax.swing.JOptionPane.showConfirmDialog(...)`: shows a Yes/No pop-up and returns that code.
3. `if (choice == YES_OPTION)`: only exits if the user clicked Yes.
4. `System.exit(0)`: closes the program. `0` means a normal exit.
### Main

```java
  public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CryptoCoinUI().setVisible(true));
    }

```

1. `main`: the program’s starting point.
2. The `for` loop finds the Nimbus theme, applies it, then `break` stops the loop.
3. `catch`: if the theme fails to load, the error is logged and the default look is used.
4. ` java.awt.EventQueue.invokeLater(() -> new CryptoCoinUI().setVisible(true));`: creates and shows the window on Swing’s UI thread.
	- `() ->` is a lambda, a short way to write code that runs later.