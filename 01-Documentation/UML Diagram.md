## Code 

```puml
@startuml
title CryptoCoin Currency Converter - UML Class Diagram

class CryptoCoinUI {
  -logger : Logger {static} {final}
  -converter : Converter {final}
  ..Swing Components..
  ~AmountLbl : JLabel
  ~ConvertBtn : JButton
  ~EndValueLbl : JLabel
  ~EndValueTF : JTextField
  ~ExitBtn : JButton
  ~FromCurrencyLbl : JLabel
  ~FromValueCB : JComboBox<String>
  ~InsertedValueTF : JTextField
  ~ResetBtn : JButton
  ~TitleLbl : JLabel
  ~ToCurrencyLbl : JLabel
  ~ToValueCB : JComboBox<String>
  ~jPanel1 : JPanel
  ~jPanel2 : JPanel
  ~jPanel3 : JPanel
  ~jPanel4 : JPanel
  ~jPanel6 : JPanel
  ~jZarLabel : JLabel
  --
  +CryptoCoinUI()
  -populateCurrencyComboBoxes() : void
  -initComponents() : void
  ..
  -InsertedValueTFActionPerformed(evt : ActionEvent) : void
  -FromValueCBActionPerformed(evt : ActionEvent) : void
  -ToValueCBActionPerformed(evt : ActionEvent) : void
  -EndValueTFActionPerformed(evt : ActionEvent) : void
  ..
  -ConvertBtnActionPerformed(evt : ActionEvent) : void
  -ResetBtnActionPerformed(evt : ActionEvent) : void
  -ExitBtnActionPerformed(evt : ActionEvent) : void
  ..
  +{static} main(args : String[]) : void
}

class Converter {
  -CODES : String[] {static} {final}
  --
  +getCodes() : String[]
  -getRate(code : String) : double
  +convert(amount : double, from : String, to : String) : double
}

class JFrame
class JOptionPane
class EventQueue
class Logger

CryptoCoinUI *-- Converter : contains
CryptoCoinUI --|> JFrame : extends
CryptoCoinUI ..> JOptionPane : uses
CryptoCoinUI ..> EventQueue : uses
CryptoCoinUI ..> Logger : uses

note right of CryptoCoinUI
  Handles the graphical interface.

  Convert:
  Converts selected currencies
  and calculates ZAR value.

  Reset:
  Clears fields and restores
  default currencies.

  Exit:
  Confirms application exit.
end note

note right of Converter
  Handles currency conversion.

  Supported currencies:
  BTC, ETH, BNB, SOL, XRP, ADA,
  DOGE, TRX, LINK, LTC, USD, ZAR

  Rates are calculated
  relative to USD.
end note
@enduml
```

## How to Use

1. Go to [plantuml.com](https://www.plantuml.com/)
2. Paste code in the block 

![[Pasted image 20261106100603.png]]

3. Screenshot the code 

![[Pasted image 20261106100544.png]]