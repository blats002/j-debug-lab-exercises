# 🚀 GitHub Codespaces Guide: 100% GUI-Based Debugging & Testing

> 💡 **No Terminal Required:** This guide is completely **GUI-driven**. You do not need to run terminal commands or worry about terminal JDK versions. Everything—running, debugging, inspecting variables, and running test suites—is handled directly through the **VS Code Debugger** and **Testing Explorer** plugins in GitHub Codespaces.

---

## 📑 Table of Contents
1. [Step 1: Fork & Launch the Codespace](#step-1-fork--launch-the-codespace)
2. [Step 2: Wait for Java Extension Initialization](#step-2-wait-for-java-extension-initialization)
3. [Step 3: Reproduce the Bug via Run & Debug](#step-3-reproduce-the-bug-via-run--debug)
4. [Step 4: Set Breakpoints & Step Through the Code](#step-4-set-breakpoints--step-through-the-code)
5. [Step 5: Verify Your Fix with the Testing Plugin](#step-5-verify-your-fix-with-the-testing-plugin)
6. [Step 6: Save Your Progress (Source Control)](#step-6-save-your-progress-source-control)
7. [Step 7: Stop the Codespace (Save Free Hours)](#step-7-stop-the-codespace-save-free-hours)
8. [Step 8: Need Help or Spotted an Issue?](#step-8-need-help-or-spotted-an-issue)
9. [Summary of GUI Controls & Shortcuts](#summary-of-gui-controls--shortcuts)

---

## Step 1: Fork & Launch the Codespace

1. Go to the repository: `https://github.com/blats002/j-debug-lab-exercises`
2. Click the **Fork** button (top-right) to create a copy under your account.
3. In your fork, click the green **`<> Code`** button.
4. Select the **Codespaces** tab and click **Create codespace on main**.

---

## Step 2: Wait for Java Extension Initialization

When your browser loads the Codespace editor:
1. Look at the bottom **Status Bar** (bottom-left / bottom-right).
2. Wait until `Opening Java Projects...` and `Building workspace...` finish and disappear.
3. If prompted for **Workspace Trust**, click **Trust Folder & Continue**.
4. If prompted for **Standard Mode**, click **Yes**.
5. Once completed, the Java Debugger and Test Runner plugins are active and ready.

---

## Step 3: Reproduce the Bug via Run & Debug

You can trigger and reproduce any exercise's crash using the **Run & Debug** dropdown:

1. Click the **Run & Debug icon** in the left Activity Bar (`Ctrl + Shift + D` / `Cmd + Shift + D`).
2. In the top dropdown, select the target module (e.g., `exercise01-nullpointer`).
3. Click the green **Play (▶️)** button (or press `F5`).
4. The program will execute and display the exception stack trace in the **Debug Console** panel at the bottom.

---

## Step 4: Set Breakpoints & Step Through the Code

### 1. Set a Breakpoint
- Open the target Java file (e.g., `UserService.java`).
- Click in the **left margin (gutter)** next to the line number where you suspect the issue occurs.
- A **solid red circle (🔴)** will appear.

### 2. Start Debugging & Inspect State
- Click the green **Play (▶️)** button in the Run & Debug panel.
- Execution will pause at your breakpoint, highlighting the line.
- **Variables Pane:** Inspect local variables and parameters (e.g. check for `null` or unexpected values).
- **Watch Pane:** Click `+` to evaluate custom boolean or arithmetic expressions.
- **Call Stack:** Inspect active frames.

### 3. Step Controls (Floating Toolbar)

| Button | Name | Shortcut | What It Does |
|:---:|:---|:---|:---|
| ▶️ | **Continue** | `F5` | Resume running until the next breakpoint. |
| ⤵️ | **Step Over** | `F10` | Run the current line and advance to the next line. |
| ⬇️ | **Step Into** | `F11` | Step inside the method called on the current line. |
| ⬆️ | **Step Out** | `Shift + F11` | Finish the current method and return to the caller. |
| 🔄 | **Restart** | `Ctrl + Shift + F5` | Restart the debug session from the beginning. |
| ⏹️ | **Stop** | `Shift + F5` | Terminate the debugging session. |

---

## Step 5: Verify Your Fix with the Testing Plugin

After fixing the bug in your code, use the **Test Explorer** to verify your changes without running any terminal commands:

1. Click the **Testing Beaker icon (🧪)** in the left Activity Bar.
2. Expand the module you are working on (e.g. `exercise01-nullpointer` ➔ `UserServiceTest`).
3. Click the **Play (▶️)** button next to the test class or method to run the test.
4. *(Optional)* Click the **Debug (🐞)** icon next to any test to step through the test with breakpoints.

- **Green Checkmark (✅):** Your fix is verified and all assertions passed!
- **Red Cross (❌):** The test failed; click the test to view the comparison diff and assertion failure.

---

## Step 6: Save Your Progress (Source Control)

1. Click the **Source Control icon** in the left Activity Bar (`Ctrl + Shift + G`).
2. Click the **`+`** icon next to modified files to stage them.
3. Enter a commit message (e.g., `fix: resolve NullPointerException in UserService`).
4. Click **Commit**, then click **Sync Changes** to push to your GitHub fork.

---

## Step 7: Stop the Codespace (Save Free Hours)

When you finish your practice session:
1. Press `F1` (or `Ctrl + Shift + P` / `Cmd + Shift + P`) to open the Command Palette.
2. Type: `Codespaces: Stop Current Codespace` and press **Enter**.
3. You can resume your workspace anytime at [github.com/codespaces](https://github.com/codespaces).

---

## Step 8: Need Help or Spotted an Issue?

If you encounter any issues, setup snags, or have feedback on the exercises:
1. Go to the [j-debug-lab-exercises Issues tracker](https://github.com/blats002/j-debug-lab-exercises/issues).
2. Click **New issue** and let us know!

---

## 📋 Summary of GUI Controls & Shortcuts

| Feature | Where to Click | Keyboard Shortcut |
|:---|:---|:---|
| **Run / Debug Exercise** | **Run & Debug Tab** (`▷`) ➔ Select Exercise from Dropdown ➔ Click **Play** | `F5` |
| **Inline Run / Debug** | Click **`Run`** / **`Debug`** link above `public static void main` in `App.java` | — |
| **Toggle Breakpoint** | Click in the gutter to the left of any line number | `F9` |
| **Step Over Line** | Floating debug bar ➔ Click **Step Over** | `F10` |
| **Step Into Method** | Floating debug bar ➔ Click **Step Into** | `F11` |
| **Run Unit Tests** | **Testing Tab** (`🧪`) ➔ Click **Play** next to any test | — |
| **Debug Unit Test** | **Testing Tab** (`🧪`) ➔ Click **Debug** (`🐞`) next to any test | — |
| **Git Commit & Push** | **Source Control Tab** (`🌿`) ➔ Stage `+` ➔ Commit ➔ Sync | `Ctrl + Shift + G` |
