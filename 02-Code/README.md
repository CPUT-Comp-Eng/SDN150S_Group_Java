# 02 — Code
Java source for the CryptoCoin converter (NetBeans project).
Coded with **Apache NetBeans IDE 31**
## Structure

CryptoCoin/  
├── src/ Java sources and Swing forms  
│ ├── Converter.java Conversion logic (currency rates, formatting)  
│ ├── CryptoCoinUI.java Main Swing window  
│ └── CryptoCoinUI.form NetBeans form definition (do not edit by hand)  
├── build.xml Ant build script (NetBeans-generated)  
├── manifest.mf JAR manifest  
└── nbproject/ NetBeans project metadata

## Building
### NetBeans
1. `File → Open Project…`
2. Select `02-Code/CryptoCoin`
3. `Run → Run Project` (F6)
### Command line
```bash
cd 02-Code/CryptoCoin
ant clean jar
```

Output JAR: `dist/CryptoCoin.jar`

## Notes

- **`build/`, `dist/`, and `nbproject/private/` are gitignored.** Do not commit   generated output or per-machine settings.
- Edit `.form` files through the NetBeans form editor, not by hand.