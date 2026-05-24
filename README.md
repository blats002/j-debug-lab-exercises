# Java Debugging Lab

Hands-on Gradle exercises for practicing the **J-DEBUG** debugging mindset on real Java exceptions.

**Full step-by-step walkthroughs, hints, and solutions** are in the paid guide (not in this repository).

- [Get the Java Debugging Lab (Gumroad)](https://saavy002.gumroad.com/l/vnccce) — ZIP includes `guide.pdf` + `solutions.pdf`

---

## Prerequisites

- **JDK 17** (LTS)
- **IDE** — IntelliJ IDEA recommended, or VS Code with Java extensions
- **Git** and a **GitHub** account (to fork this repo)

---

## Quick start

### 1. Fork this repository

1. Open this repo on GitHub.
2. Click **Fork** (upper right) and create a copy under your account.
3. Clone **your fork** locally:

   ```bash
   git clone git@github.com/YOUR_USERNAME/j-debug-lab-exercises.git
   cd j-debug-lab-exercises
   ```

### 2. Open the project

- **IntelliJ:** File → Open → select the repository root (the folder containing `settings.gradle`).
- **GitHub Codespaces:** On your fork, click **Code** → **Codespaces** → **Create codespace on main**.

### 3. Run an exercise

From the project root:

```bash
./gradlew :exercise01-nullpointer:run
```

Windows:

```text
gradlew :exercise01-nullpointer:run
```

Each exercise is a separate Gradle module. Use your purchased **guide.pdf** for the full J-DEBUG walkthrough for that module.

---

## Exercise index

| # | Module | Exception |
|---|--------|-----------|
| 01 | `exercise01-nullpointer` | NullPointerException |
| 02 | `exercise02-nullpointer-di` | NullPointerException |
| 03 | `exercise03-index-loop` | ArrayIndexOutOfBoundsException |
| 04 | `exercise04-index-emptylist` | IndexOutOfBoundsException |
| 05 | `exercise05-divide-zero` | ArithmeticException |
| 06 | `exercise06-number-format` | NumberFormatException |
| 07 | `exercise07-classpath` | ClassNotFoundException |
| 08 | `exercise08-illegal-argument` | IllegalArgumentException |
| 09 | `exercise09-file-path` | FileNotFoundException |
| 10 | `exercise10-io-permission` | IOException |
| 11 | `exercise11-concurrent-mod` | ConcurrentModificationException |
| 12 | `exercise12-illegal-state` | IllegalStateException |
| 13 | `exercise13-sql-syntax` | SQLException |
| 14 | `exercise14-sql-connection` | SQLException |
| 15 | `exercise15-json-parse` | JsonProcessingException |
| 16 | `exercise16-http-unknown-host` | UnknownHostException |
| 17 | `exercise17-thread-interrupt` | InterruptedException |
| 18 | `exercise18-memory-leak` | OutOfMemoryError |
| 19 | `exercise19-stackoverflow` | StackOverflowError |
| 20 | `exercise20-custom-exception` | OrderValidationException |

---

## J-DEBUG overview

| Step | Name |
|------|------|
| **J** | Just Reproduce the Bug |
| **D** | Diagnose the Error Message |
| **E** | Examine the Stack Trace |
| **B** | Break Down the Code Path |
| **U** | Use Debugging Tools |
| **G** | Generate a Fix & Verify It |

Steps **J through U** for each exercise are in **guide.pdf**. Hints and **G** are in **solutions.pdf** (paid download).

---

## Project structure

Multi-module Gradle project. Each `exerciseNN-*` folder contains intentionally buggy code for you to fix in your fork.

---

## License

Exercise source code is licensed under the MIT License — see [LICENSE](LICENSE).

The J-DEBUG guide and solutions PDFs are separate copyrighted products and are not included in this repository.
