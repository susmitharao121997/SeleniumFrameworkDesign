# Selenium Framework Design

This repository contains a structured Selenium automation framework developed using Java, TestNG, and the Page Object Model (POM) design pattern. The framework is designed for scalable and maintainable test automation.

## Project Overview

The Selenium Framework Design project demonstrates automation best practices and framework architecture commonly used in real-world testing environments. It includes reusable methods, organized page classes, and test scripts that interact with web applications.

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Git
- WebDriverManager

## Framework Structure

SeleniumFrameworkDesign
│
├── src
│ ├── main
│ │ └── java
│ │ ├── base
│ │ │ Base test setup and driver initialization
│ │ ├── pages
│ │ │ Page classes with locators and actions
│ │ └── utils
│ │ Utility functions and helpers
│ │
│ └── test
│ └── java
│ └── tests
│ TestNG test classes
│
├── drivers
│ Browser driver executables
│
├── test-output
│ TestNG reports
│
├── pom.xml
│ Maven configuration file
│
└── README.md

## Key Features

- Structured Page Object Model (POM)
- Reusable methods for actions and utilities
- Centralized driver management
- TestNG framework for test execution
- Support for multiple test scenarios
- Clear separation of test logic and page elements
- Maven for project and dependency management

## Prerequisites

- Java JDK 8 or above
- Maven
- IDE such as Eclipse or IntelliJ
- Browser drivers compatible with the browser version

## How to Use

1. Clone the repository:
git clone https://github.com/susmitharao121997/SeleniumFrameworkDesign.git

sql
Copy code

2. Open the project in Eclipse or IntelliJ as a Maven project.

3. Ensure required browser drivers are available or configured.

4. Execute the tests:
   From IDE:
   - Run test classes as TestNG tests

   From command line:
mvn test

## Best Practices Followed

- Page Object Model (POM) design pattern
- Reusable and maintainable code
- Organized test suites
- External configuration support (if applicable)
- Maven project standards
