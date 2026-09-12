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

## 🛠️ Requirements & Tech Stack

- **Java Development Kit (JDK):** Version 17 or higher
- **Build Tool:** Gradle (or Gradle Wrapper)
- **External Dependencies:**
  - [Google Gson](https://github.com/google/gson) `2.10.1` — JSON serialization
  - [JUnit 5](https://junit.org/junit5/) `5.10.0` — Unit testing framework

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
