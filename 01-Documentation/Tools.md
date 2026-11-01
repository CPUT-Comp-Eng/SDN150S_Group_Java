# Tools Used

Tools and technologies used throughout the SDN150S group project,
mapped to the task each supported.

| Tool | Version / Link | Purpose |
|---|---|---|
| **Apache NetBeans IDE** | 31 — [netbeans.apache.org](https://netbeans.apache.org/) | Primary Java IDE — writing, compiling, and running the Swing application; used the NetBeans Form Editor to build `CryptoCoinUI.form` |
| **Java (JDK)** | (from NetBeans installation) | Language and runtime for the converter application |
| **Git** | [git-scm.com](https://git-scm.com/) | Local version control — commits, branches, merges |
| **GitHub** | [github.com](https://github.com/) | Remote repository hosting, pull requests, code review, and submission |
| **PlantUML** | [plantuml.com](https://plantuml.com/) | UML class / activity diagrams for the report — text-based, version-controllable diagram source |
| **Obsidian** | [obsidian.md](https://obsidian.md/) | Markdown note-taking for pseudocode, documentation drafts, and project planning |
| **Microsoft Word / OnlyOffice** | — | Technical report authoring and export to PDF (Cabri/Calibri 11, 1.5 line spacing, Harvard citations) |

## Notes

- **NetBeans 31** — chosen because it bundles the Swing form editor required by
  the brief ("Java Frame Forms") and generates the Ant build script
  (`build.xml`, `nbproject/`) that makes the project reproducible on any machine.
- **PlantUML** — diagrams are written as plain text (`@startuml … @enduml`) and
  rendered to image; this keeps them diffable in Git and easy to embed in the
  report.
- **Obsidian** — used for the `01-Documentation/` Markdown files (`Pseudocode.md`,
  `Source Code.md`); all files are plain `.md` so they render on GitHub without
  extra tooling.
- **Microsoft Word / OnlyOffice** — either was used to author `04-Report/Report.docx`
  and export the PDF for submission, per the brief's formatting requirements.