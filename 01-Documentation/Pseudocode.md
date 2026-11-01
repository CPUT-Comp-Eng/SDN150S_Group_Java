## Converter

```
Converter

Keep a list of currencies: BTC, ETH, USDT, BNB, SOL, XRP, ADA, DOGE, USD, ZAR.

Give the list:
    Send back the list.

Find the USD value of a currency:
    BTC is 68000
    ETH is 2500
    USDT is 1
    BNB is 600
    SOL is 160
    XRP is 0.55
    ADA is 0.40
    DOGE is 0.12
    USD is 1
    ZAR is 0.060
    Anything else is minus 1
    Send back the value.

Convert an amount:
    Multiply the amount by the USD value of the first currency.
    Divide that by the USD value of the second currency.
    Send back the answer.
```

## CryptoCoinUI

```
CryptoCoinUI

Start:
    Create a Converter.
    Fill the dropdowns with the currencies.
    Set From to ZAR and To to USD.
    Lock the Conversion box.
    Show the window.

Convert button:
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
