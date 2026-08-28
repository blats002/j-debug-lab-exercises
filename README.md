# The J-DEBUG Lab: Hands-On Java Debugging Exercises

[![Java 17](https://img.shields.io/badge/Java-17%2B-blue.svg)](https://openjdk.org/projects/jdk/17/)
[![Gradle](https://img.shields.io/badge/Gradle-8.x-02303A.svg?logo=gradle)](https://gradle.org)
[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://github.com/codespaces/new?hide_repo_select=true&ref=main&repo=blats002/j-debug-lab-exercises)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Master real-world Java debugging through deliberate practice. This repository contains **20 isolated, broken Java modules** covering recurring production exceptions, memory leaks, concurrency bugs, and architectural anti-patterns.

---

## 🎯 The J-DEBUG 6-Step Methodology

When investigating any bug in this lab, apply the 6-step framework:

| Step | Principle | Core Action |
|:---:|:---|:---|
| **[J]** | **Just Reproduce the Bug** | Make the bug happen on demand with a deterministic command. |
| **[D]** | **Diagnose the Error Message** | Read the exception type and message closely before touching code. |
| **[E]** | **Examine the Stack Trace** | Identify the topmost application frame in your codebase. |
| **[B]** | **Break Down the Code Path** | Place breakpoints and inspect parameter state vs assumptions. |
| **[U]** | **Use Debugging Tools** | Step over, step into, monitor watches, and evaluate expressions. |
| **[G]** | **Generate a Fix & Verify It** | Implement the minimal clean fix and prove it with automated tests. |

---

## 🚀 Quick Start (60 Seconds)

### Option A: 1-Click Cloud Sandbox (GitHub Codespaces - Recommended)
1. Fork this repository to your GitHub account.
2. Click the badge below to launch a pre-configured browser IDE with JDK 21, Gradle, and debugging extensions ready:
   
   [![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://github.com/codespaces/new?hide_repo_select=true&ref=main&repo=blats002/j-debug-lab-exercises)

📖 **Full Step-by-Step Visual Guide:** See [GITHUB_CODESPACES_GUIDE.md](GITHUB_CODESPACES_GUIDE.md) for complete 100% GUI-based debugging & testing instructions.

### Option B: Local Setup
1. Ensure **JDK 17+** is installed:
   ```bash
   java -version
   ```
2. Fork and clone your repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/j-debug-lab-exercises.git
   cd j-debug-lab-exercises
   ```
3. Open the root folder in **IntelliJ IDEA** or **VS Code**.

---

## 🧪 How to Practice

Each exercise is an isolated Gradle submodule under `exerciseNN-*`.

### 1. Reproduce the Crash (Step J)
- **GUI (Codespaces / VS Code):** Open the **Run & Debug** panel (`Ctrl + Shift + D`), select the exercise configuration from the top dropdown (e.g. `exercise01-nullpointer`), and click the green **Play (▶️)** button.
- **Terminal (Optional):**
  ```bash
  ./gradlew :exercise01-nullpointer:run
  ```

### 2. Debug and Investigate (Steps D, E, B, U)
- Set breakpoints by clicking in the left gutter next to any line number.
- Inspect variables, watches, call stacks, and evaluate expressions while execution is paused.

### 3. Verify Your Fix (Step G)
- **GUI (Codespaces / VS Code):** Open the **Testing Tab (🧪)** in the left sidebar and click **Play (▶️)** next to the exercise test class.
- **Terminal (Optional):**
  ```bash
  ./gradlew :exercise01-nullpointer:test
  ```

Run all lab tests across all 20 modules:
```bash
./gradlew test
```

---

## 🌿 Official Git Solution Branches

This repository maintains **isolated solution branches** so you can inspect clean, verified reference solutions or compare your diff:

- **Single Exercise Solutions:** `solutions-ex1` through `solutions-ex20`
- **Master Solution Branch (All 20 Fixed):** `solutions`
- **Starter Practice Branch:** `main`

### Solution Commands:
```bash
# Switch to Exercise 01 solution
git checkout solutions-ex1

# Compare your code against the official Exercise 01 fix
git diff main..origin/solutions-ex1 -- exercise01-nullpointer

# Switch back to your practice branch
git checkout main
```

---

## 📋 Exercise Curriculum (20 Modules & Solution Branches)

| # | Module Directory | Exception / Failure Mode | Target Debugging Pattern | Solution Branch |
|:---:|:---|:---|:---|:---:|
| **01** | `exercise01-nullpointer` | `NullPointerException` | Uninitialized Field & Reference Guard | `solutions-ex1` |
| **02** | `exercise02-nullpointer-di` | `NullPointerException` | Missing Dependency Injection / Wiring | `solutions-ex2` |
| **03** | `exercise03-index-loop` | `ArrayIndexOutOfBoundsException` | Off-by-One Loop Boundary | `solutions-ex3` |
| **04** | `exercise04-index-emptylist` | `IndexOutOfBoundsException` | Positional Access on Empty List | `solutions-ex4` |
| **05** | `exercise05-divide-zero` | `ArithmeticException` | Division Guard & Defensive Validation | `solutions-ex5` |
| **06** | `exercise06-number-format` | `NumberFormatException` | String Number Parsing & Sanitization | `solutions-ex6` |
| **07** | `exercise07-classpath` | `ClassNotFoundException` | Classpath Resolution & FQCN Verification | `solutions-ex7` |
| **08** | `exercise08-illegal-argument` | `IllegalArgumentException` | Domain Boundary & Input Validation | `solutions-ex8` |
| **09** | `exercise09-file-path` | `FileNotFoundException` | Working Directory (CWD) Resolution | `solutions-ex9` |
| **10** | `exercise10-io-permission` | `IOException` | Directory Creation & Write Permissions | `solutions-ex10` |
| **11** | `exercise11-concurrent-mod` | `ConcurrentModificationException` | Mutation During Active Iteration | `solutions-ex11` |
| **12** | `exercise12-illegal-state` | `IllegalStateException` | Object Lifecycle Invariant Enforcement | `solutions-ex12` |
| **13** | `exercise13-sql-syntax` | `SQLException` | SQL Grammar, Keywords & Escaping | `solutions-ex13` |
| **14** | `exercise14-sql-connection` | `SQLException` (Connection Refused) | JDBC URL Protocol & Port Reachability | `solutions-ex14` |
| **15** | `exercise15-json-parse` | `JsonProcessingException` | JSON Schema & DTO Deserialization | `solutions-ex15` |
| **16** | `exercise16-http-unknown-host` | `UnknownHostException` | DNS Resolution & URI Hostname Formatting | `solutions-ex16` |
| **17** | `exercise17-thread-interrupt` | `InterruptedException` | Java Thread Interruption Policy | `solutions-ex17` |
| **18** | `exercise18-memory-leak` | `OutOfMemoryError` (Heap Space) | GC Root Retention in Continuous Loops | `solutions-ex18` |
| **19** | `exercise19-stackoverflow` | `StackOverflowError` | Unbounded Recursion & Base Case | `solutions-ex19` |
| **20** | `exercise20-custom-exception` | `OrderValidationException` | Custom Domain Error Hierarchy | `solutions-ex20` |

---

## 📖 Interactive Companion & Master Guide

For detailed walkthroughs, JVM runtime deep dives, diagnostic hints, AI mentor prompts, and auto-saving personal note-taking:

👉 **[Get The J-DEBUG Mindset & Interactive Lab Companion on Gumroad](https://saavy002.gumroad.com/l/vnccce)**

---

## 📄 License

The practice exercise code in this repository is open-sourced under the [MIT License](LICENSE).
