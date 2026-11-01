# SDN150S — Java 8-Person Group Project
**Software Design 1 (SDN150S) Project Brief**
**Due:** November 08, 2026

A Java currency converter (cryptocurrency-focused) built with Java Swing Frame Forms,
demonstrating constructors, access modifiers, control statements, and input validation.

---
## Team Members
| Slot | Name | Student No. | GitHub | Contribution |
| :---: | :--- | :--- | :--- | :--- |
| **1** | Etienne Roux | 260041637 | [RouxTronics](https://github.com/RouxTronics) | Code, pseudocode |
| **2** | Garison Pieters | 222535164 | [LinkCloudCT](https://github.com/LinkCloudCT) | GUI, code |
| **3** | Jonathan Strauss | 260083607 | [JohnnyJoestr](https://github.com/JohnnyJoestr) | UML diagram |
| **4** | Henning Myburgh | 260403237 | [Henning-apx007](https://github.com/Henning-apx007) | Some code |
| **5** | Joshua Isaacs | 261755692 | [joshuai582-stack](https://github.com/joshuai582-stack) | – |
| **6** | Robert Erady Kanegamba | 260273600 | [robitiii](https://github.com/robitiii) | – |
| **7** | Sinovuyo Asathi Danca | 260554898 | [sinovuyo-asathi-danca](https://github.com/sinovuyo-asathi-danca) | – |
| **8** | Motheo Nkadimeng | 251142884 | [motheonkadimeng](https://github.com/motheonkadimeng) | – |

---
## Project Objective
Design a Java program that converts **10 cryptocurrency pairs**
(e.g. BTC/ETH, BTC/LTC, ETH/LTC, …), with a user-friendly Swing GUI,
error handling, and input validation.
### Required Java concepts
- **Constructors** and **access modifiers** (`public`, `private`, …)
- **Control statements** (`if`/`switch`/loops)
- **Java Frame Forms** (Swing)
- Whitespace + single/multi-line comments for readability
---
## Features
- Convert between **10 cryptocurrency pairs** using a fixed rate table defined in `Converter.java`
- Swing GUI with currency selectors, amount field, convert and reset buttons
- Input validation (numeric amounts only, non-negative, non-empty selection)
- ZAR display label and formatted output with thousands separators

> **Note:** exchange rates are project-defined constants (illustrative), not
> fetched from a live API. This keeps the demo deterministic and offline-friendly.
---
## Repository Layout
| Folder | Contents |
| :--- | :--- |
| `00-Resources/` | Official brief, Harvard/IEEE style guides, marks chart, report template, plagiarism declaration |
| `01-Documentation/` | Pseudocode and source-code documentation (UML/diagrams) |
| `02-Code/CryptoCoin/` | Java source (NetBeans project — `Converter.java`, `CryptoCoinUI.java`) |
| `03-Demo/` | Demo video (hosted externally; link in `03-Demo/README.md`) |
| `04-Report/` | Final technical report (`.docx` / PDF) |

---
## Building & Running
### NetBeans
1. `File → Open Project…`
2. Select `02-Code/CryptoCoin`
3. `Run → Run Project` (F6)
### Command line
```bash
cd 02-Code/CryptoCoin
ant clean jar
```

The built JAR is written to `dist/CryptoCoin.jar` (ignored by git).

## Branching

|Branch|Purpose|
|---|---|
|`main`|Submission-ready code, documentation, and report. This is what gets graded.|
|`archives`|Historical team working folders (`01-Team/`). Kept for provenance; not part of the submission build.|
## Submission Checklist (per brief)

|#|Requirement|Where|
|---|---|---|
|1|Source code (Java program)|`02-Code/CryptoCoin/`|
|2|Technical report (PDF, Cabri 11, 1.5 line spacing, Harvard style)|`04-Report/Report.docx` → export PDF|
|3|UML diagram (inside report)|`01-Documentation/` + embedded in report|
|4|Pseudocode (inside report)|`01-Documentation/Pseudocode.md` + embedded in report|
|5|Video demonstration (3–5 min)|Link in `03-Demo/README.md`|
### Report structure (per brief)

- Introduction
- Sub-questions
- Discussion — software design approach, engineering method, skills, tools
- Results / analysis
- Conclusion
**Word limit:** 2000 words.  
**Font**: Cabri/Calibri size 11, 1.5 Spacing
**Citation style:** Harvard (see `00-Resources/Harvard style.pdf`).


