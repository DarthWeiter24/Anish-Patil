# Task2 Monefy Android app UI Automation

This repository contains end-to-end UI automation tests for the Monefy Android app using UIAutomator, JUnit4, and Kotlin. The goal is to ensure core financial operations — like adding expenses, incomes, and verifying balance consistency — work as expected.

## Project Setup

### Prerequisites

- Android Studio (latest version)
- Android SDK
- Java 11+
- An emulator or Android device connected
- Gradle
  
### Installation

1. **Clone the Repository:**

```bash
git clone <>
```
2. **Open in Android Studio:**

   - Select **File → Open** and navigate to this project directory.

3. **Sync Gradle:**

   - Android Studio will automatically prompt you to sync. Accept it.

4. **Attach a Device or Emulator:**

   - Make sure you have a running emulator or a connected device with developer mode enabled.

### Running Tests

#### From Android Studio

- Right-click on the `BaseTest` class → Select **Run 'Tests in BaseTest'**.

### Test Results

- Test results will be generated under:
`app/build/reports/androidTests/connected/`

- Open `index.html` in a browser to view the test execution report.

## Approach & Architecture

### Test Strategy

The tests are structured using the **Page Object Model (POM)** design pattern. This promotes reusability, maintainability, and separation of concerns by keeping UI interactions encapsulated within screen-specific classes. Each test in the suite focuses on validating a specific feature or flow while reusing common interaction logic.

### Architecture Overview

 Screens of the Monefy app has a dedicated Kotlin class in the `screens/`.
General utilities for device interaction are under `utils/` package as `TestUtils.kt`
`AddIncomeScreen.kt` and `AddExpenseScreen.kt` has a lot of common UI so it has been bundled under `AddEntryUtils.kt`. These are then used by the test suite (`BaseTest`) to simulate and verify user actions.

### Folder Structure
```
 app/src/androidTest/java/
└── com/example/monefyuiautomation/
    ├── screens/
    │   ├── AddExpenseScreen.kt
    │   ├── AddIncomeScreen.kt
    │   ├── BalanceScreen.kt
    │   ├── HomeScreen.kt
    │   └── UpsellScreen.kt
    ├── utils/
    │   ├── AddEntryUtils.kt
    │   └── TestUtils.kt
    └── tests/
        └── BaseTest.kt
```

### Screens & Utilities


| Screen/Class         | Purpose                                                                 |
|----------------------|-------------------------------------------------------------------------|
| `BaseTest.kt`         | Main suite containing all functional test cases                         |
| `HomeScreen.kt`       | Page object for interacting with the Home screen                        |
| `AddExpenseScreen.kt` | Page object for interacting with the Add Expense screen                 |
| `AddIncomeScreen.kt`  | Page object for interacting with the Add Income screen                  |
| `BalanceScreen.kt`    | Page object for balance screen and balance computation                                    |
| `UpsellScreen.kt`     | Handles upsell modal shown during app launch                            |
| `AddEntryUtils.kt`    | Utility class for handling common actions on Expense and Income Screen          |
| `TestUtils.kt`        | Utility class for device interactions (e.g. UIWait, clicks etc)  |


This approach makes the test suite scalable and easier to maintain as the app evolves.

