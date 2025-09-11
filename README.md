# HRMS_Software_BDD-With-Maven
![Java](https://img.shields.io/badge/Java-17-orange) ![Selenium WebDriver](https://img.shields.io/badge/Selenium%20WebDriver-3.141.59-yellowgreen) ![TestNG](https://img.shields.io/badge/TestNG-v7.9-blue) ![WebDriverManager](https://img.shields.io/badge/WebDriverManager-v5.1.0-blueviolet) ![JavaFaker](https://img.shields.io/badge/JavaFaker-v1.0.2-lightgray) ![Gradle](https://img.shields.io/badge/Gradle-v7.2-blue) ![Allure](https://img.shields.io/badge/Allure-v2.13.9-red) [![Cucumber](https://img.shields.io/badge/Cucumber-BDD-yellowgreen)](https://cucumber.io/)

## Project Overview

This project is an **automated testing suite** for **HRMS Solution** () web application using **Selenium WebDriver**, **TestNG**, and **BDD (Cucumber)**. It covers various test cases such as login, employee management, leave, payroll, attendance, and report generation. The framework also integrates **Allure** for generating professional HTML reports.

---

## Technologies Used

- ![Java](https://img.shields.io/badge/Java-17-orange)
- ![Selenium WebDriver](https://img.shields.io/badge/Selenium%20WebDriver-3.141.59-yellowgreen)
- ![TestNG](https://img.shields.io/badge/TestNG-v7.9-blue)
- ![WebDriverManager](https://img.shields.io/badge/WebDriverManager-v5.1.0-blueviolet)
- ![Gradle](https://img.shields.io/badge/Gradle-v7.2-blue)
- ![Cucumber](https://img.shields.io/badge/Cucumber-BDD-yellowgreen)
- ![Allure](https://img.shields.io/badge/Allure-v2.13.9-red)

---
## Project Structure
```
├── src/
│   ├── main/
│   │   ├── java/
│   ├── test/                        # All test are in this folder
│   │   ├── java/
│   │   │   ├── pages/               # Page Object Model (POM) Classes
│   │   │   ├── setup/               # WebDriver Setup
│   │   │   ├── testrunner/          # TestNG Test Runner Classes
│   │   │   ├── utils/               # Other utility methods that commonly used allover the project
│   │   ├── resources/
│   │   │   ├── Features/         # Cucumber features files here 
│   │   │   ├── suites/              # Test suites
│   │   │   ├── config.properties    # Keeps config items like base URL
│   │   │   ├── Users.json           # User credentials file
├── .gitignore                       # GitIgnore file
├── build.gradle                     # Gradle build file
├── README.md                        # Project Documentation
```

## Prerequisites
Before running the project, ensure you have the following installed:
- Java 17+
- Make sure the gradle bin folder is defined in system env path.
- Git (optional, for version control)
- Make sure system has installed latest version of Allure for generating html report

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/mookto/Office-Management-BDD-with-Gradle.git
   ```

   ```
## Running Tests
- Run all tests:
  ```sh
  gradle clean test
  ```
- Run a specific test class:
  ```sh
  gradle test --tests org.gradle.SomeTest.someSpecificFeature
  ```

## Generating Allure Report
- After running all tests, run the mentioned commands,
  ```sh
  allure serve allure-results
  ```


## Test Cases Overview
### 1. **Login Tests**
- Valid user login (`LoginTestRunner.java`)
- Verify dashboard redirection after login

### 2. **Employee Management**
- Create a new employee (`EmployeeManagementTestRunner.java`)
- Edit existing employee details
- Assign a supervisor
- Edit a supervisor
- Close an employee

### 3. **Leave Management**
- Apply for leave (`LeaveManagementTestRunner.java`)
- Implementation pending...

### 4. **Attendance Management**
- Manage employee attendance (`AttendanceManagementTestRunner.java`)
- Implementation pending...

### 5. **Official Letter Management**
- Manage official letter (`OfficialLetterTestRunner.java`)
- Create official letter type
- Create official letter
- Implementation pending...

### 6. **Payroll Management**
- Manage payroll (`PayrollManagementTestRunner.java`)
- Implementation pending...

### 7. **Report Management**
- Manage reports (`ReportsTestRunner.java`)
- Implementation pending...

### 8. **Roster Management**
- Manage payroll (`RosterManagementTestRunner.java`)
- Implementation pending...

### 9. **Settings Management**
- Manage payroll (`SettingsTestRunner.java`)
- Implementation pending...


## Contributing
1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature-branch
   ```
3. Commit changes:
   ```sh
   git commit -m "Add new feature"
   ```
4. Push and create a pull request.


## Future Improvements
- Implement CI/CD integration
- Enhance reporting with **Allure Reports**


## Contributors
- Mahedi Hasan




