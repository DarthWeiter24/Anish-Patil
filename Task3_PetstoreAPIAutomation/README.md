# Task3 RESTful API Test Automation

## Project Setup

### Prerequisites
- Java 11 or above  
- Maven  
- IDE (e.g. Eclipse, IntelliJ IDEA) This project was done with Eclipse    
- TestNG plugin installed in IDE

### Installation

#### 1. Clone the Repository

```bash
git clone <>
```
### 2. Open in Your IDE

- Import the project as a **Maven project**  

### 3. Install Dependencies

- All required dependencies (**RestAssured**, **TestNG**, **ExtentReports**) are managed via `pom.xml`.
- Maven will automatically download them during first build.

## How to run the test
### From IDE

- Right-click on `testng.xml` → **Run As** → **TestNG Suite**
  
### Test Results

 - HTML test reports are generated using **ExtentReports**.

 - **Output Location:**

    `./reports/TestReport-<timestamp>.html`

## Approach & Architecture


### Test Strategy

### Architecture Overview

### Folder Structure

```
├───src
│   └───test
│       ├───java
│       │   └───api
│       │       ├───endpoints
│       │       │   ├───Routes.java
│       │       │   └───StoreEndPoints.java
│       │       ├───payload
│       │       │   └───Store.java
│       │       ├───tests
│       │       │   └───StoreTests.java
│       │       └───utilities
│       │           └───ExtentReportManager.java
│
└───reports
    └───TestReport-CurrentDateTime.html  

```

### Classes 

### Tech Stack

| Tool           | Why this?                                                                 |
|----------------|-------------------------------------------------------------------------|
| **TestNG**     | Simplifies test creation and execution with features like annotations (`@Test`, `@Before`) and assertions. |
| **RestAssured**| Java library for testing RESTful APIs  |
| **ExtentReports** | Generates HTML test reports with logs and analytics                |

## Test Coverage

### Current Test Cases

### Test run
#### Test Report

[Test Run Report](https://github.com/DarthWeiter24/Anish-Patil/blob/main/Task3_PetstoreAPIAutomation/reports/TestReport-2025-04-22_21-38-06.html)

