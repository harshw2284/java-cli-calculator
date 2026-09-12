# CLI Calculator [![Java CI with Gradle](https://github.com/harshw2284/java-cli-calculator/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/harshw2284/java-cli-calculator/actions/workflows/gradle-build.yml)

A lightweight, console-based Java application built to demonstrate core Gradle concepts including dependency management, multi-task execution, unit testing with JUnit 5, and build artifact generation.

---

## 📌 Project Overview

This project serves as a practical testbed for Gradle build tool automation. It provides a simple command-line interface (CLI) for performing arithmetic operations, tracking calculation history, and exporting history records to a structured JSON file.

### Key Features
- **Basic Arithmetic Operations:** Perform addition and subtraction.
- **History Tracking:** Automatically records every calculation in memory.
- **JSON Export:** Serializes calculation history into a formatted `history.json` file using Google's **Gson** library.
- **Unit Testing:** Comprehensive test coverage using **JUnit 5 (Jupiter)**.

---

## 🛠️ Requirements 

- **Java Development Kit (JDK):** Version 17 or higher
- **Build Tool:** Gradle (or Gradle Wrapper)
- **External Dependencies:**
  - [Google Gson](https://github.com/google/gson) `2.10.1` — JSON serialization
  - [JUnit 5](https://junit.org/junit5/) `5.10.0` — Unit testing framework

## 🛠️ Tech Stack
 
| Component | Technology | Version |
|---|---|---|
| Language | Java (JDK) | 17+ |
| Build Tool | Gradle (Groovy DSL) | Wrapper-managed |
| JSON Serialization | [Google Gson](https://github.com/google/gson) | 2.10.1 |
| Testing Framework | [JUnit 5 (Jupiter)](https://junit.org/junit5/) | 5.10.0 |
| Test Launcher | JUnit Platform | 1.10.0 |

---

## 📁 Project Directory Structure

The project strictly follows the standard Maven/Gradle source layout:

```text
cli-calculator/
├── build.gradle
├── settings.gradle
└── src/
    ├── main/
    │   └── java/
    │       └── calculator/
    │           ├── App.java           # Entry point (CLI User Interface)
    │           ├── Calculator.java    # Core business & export logic
    │           └── Calculation.java   # Data model for calculation entries
    └── test/
        └── java/
            └── calculator/
                └── CalculatorTest.java# JUnit 5 unit tests
```

## ⚙️ How It Works
 
| Class | Responsibility |
|---|---|
| `App.java` | Entry point of the application (`calculator.App`); drives the interactive CLI loop and reads user input. |
| `Calculator.java` | Core arithmetic and history-tracking logic; handles JSON export of history via Gson. |
| `Calculation.java` | A simple data model (POJO) representing one calculation record stored in history. |
| `CalculatorTest.java` | JUnit 5 test suite validating calculator behavior. |
 
## 🚀 Getting Started
 
### Prerequisites
 
- **JDK 17 or higher** installed and available on your `PATH`
- No local Gradle installation required — this project uses the **Gradle Wrapper** (`gradlew` / `gradlew.bat`)
- 
### Clone the Repository
 
```bash
git clone https://github.com/<your-username>/cli-calculator.git
cd cli-calculator
```
 
### Build the Project
 
Compiles the source, runs all tests, and packages the application:
 
```bash
gradle build
```
  
### Run the Application
 
Launches the interactive CLI calculator:
 
```bash
gradlew run
```
 
### Run the Tests
 
Executes the JUnit 5 test suite on its own:
 
```bash
gradle test
```
 
## 📋 Gradle Tasks Reference
 
| Command | Description |
|---|---|
| `./gradle build` | Full build — compiles, tests, and packages the app. |
| `./gradle run` | Runs the calculator interactively (stdin is wired to the console). |
| `./gradle test` | Runs the JUnit 5 test suite via the JUnit Platform. |
| `./gradlew jar` | Packages compiled classes into a runnable `.jar`. |
| `./gradlew clean` | Deletes the `build/` output directory. |
| `./gradlew clean build` | Fresh build from scratch. |

