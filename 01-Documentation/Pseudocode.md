```
Converter

Keep a list of currencies: BTC, ETH, BNB, SOL, XRP, ADA, DOGE,
    TRX, LINK, LTC, USD, ZAR.

Give the list:
    Send back the list.

Find the USD value of a currency:
    BTC is 77962.69
    ETH is 2287.69
    BNB is 702.63
    SOL is 94.50
    XRP is 1.26
    ADA is 0.40
    DOGE is 0.071
    TRX is 0.3174
    LINK is 11.35
    LTC is 54.94
    USD is 1
    ZAR is 0.060
    Anything else is 1
    Send back the value.

Convert an amount:
    Multiply the amount by the USD value of the first currency.
    Divide that by the USD value of the second currency.
    Send back the answer.
    

CryptoCoinUI

Start:
    Create a Converter.
    Fill the dropdowns with the currencies.
    Set From to USD and To to BTC.
    Lock the Conversion box.
    Show the window.

Convert button (also run when Enter is pressed in the amount box):
    Read the amount.
    If it is not a number, show an error and stop.
    If it is negative, show an error and stop.
    Convert it using the chosen currencies.
    Show the result.
    Convert it to ZAR and show that too.

Reset button:
    Clear the boxes and the ZAR label.
    Set From to USD and To to BTC.

Exit button:
    Ask the user to confirm.
    If yes, close the program.
```
