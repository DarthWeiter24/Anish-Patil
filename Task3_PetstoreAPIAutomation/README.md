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

The tests are structured using a modular API testing framework that emphasizes clean separation of responsibilities across packages such as endpoints, payload, tests, and utilities. 

### Architecture Overview

![Screenshot 2025-04-23 222454](https://github.com/user-attachments/assets/eb74a192-f6f4-4a40-aac0-5403b1f7d999)

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

| Class/File                | Purpose                                                                                           |
|---------------------------|---------------------------------------------------------------------------------------------------|
| `Routes.java`             | Centralized file for defining static URLs.                      |
| `StoreEndPoints.java`     | Contains methods that handle the actual HTTP requests (GET, POST, PUT, DELETE) to the store endpoints. |
| `Store.java`              | POJO class that defines the structure of store-related request and response bodies.. |
| `StoreTests.java`         | Test class that contains functional test cases for Store APIs |
| `ExtentReportManager.java`| Utility class for setting up and managing ExtentReports. Handles HTML report creation and test result formatting. |


### Tech Stack

| Tool           | Why this?                                                                 |
|----------------|-------------------------------------------------------------------------|
| **TestNG**     | Simplifies test creation and execution with features like annotations (`@Test`, `@Before`) and assertions. |
| **RestAssured**| Java library for testing RESTful APIs  |
| **ExtentReports** | Generates HTML test reports with logs and analytics                |

## Test Coverage

### Current Test Cases

| Test Name                         | Purpose                                                                 |
|----------------------------------|-------------------------------------------------------------------------|
| testCreateOrder                  | Verifies that a valid order can be created successfully.               |
| testValidOrder                   | Checks that the created order can be retrieved and has the correct ID. |
| testGetInventory                 | Validates that inventory data is retrievable and includes "approved".  |
| testDeleteValidOrder             | Confirms that an existing order can be deleted successfully.           |
| testGetOrderWithInvalidId        | Ensures the API returns 404 for an invalid/nonexistent order ID.       |
| testDeleteInvalidOrder           | Verifies that deleting an invalid order ID returns a 404 status.       |
| testCreateOrderWithEmptyPayload  | Tests that creating an order with empty payload is rejected.           |
| testCreateOrderWithNegativePetId | Tests that creating an order with invalid pet ID (negative) is not accepted.   |


### Test run
#### Test Report

[Test Run Report](https://github.com/DarthWeiter24/Anish-Patil/blob/main/Task3_PetstoreAPIAutomation/reports/TestReport-2025-04-22_21-38-06.html)

