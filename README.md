# seleniumwd-java-ageno_pl-gui-tests
Automated tests fo the webpage: ageno.pl 

Selenium WebDriver – Test Automation (Java)
Project overview

This project is a minimal yet production-style test automation framework created as a portfolio example for a Test Automation Engineer role.

The framework validates client-side form validation on the Ageno.pl contact page using:

Selenium WebDriver

Java 17

JUnit 5

Maven

Page Object Model (POM) with PageFactory

Data-driven tests

Scope:

automated negative test case

validation of exact error message

stable waits and retry mechanism for page loading

execution in Chrome browser only

Test scenario (business description)

Negative test case – email field validation

Open page: https://ageno.pl/kontakt/

Click into the “Twój e-mail” input field

Enter a value that is not an email (e.g. fsfdadfsafsaf)

Leave the field using TAB

Verify that the validation message is displayed:

Proszę wpisać adres e-mail.

Requirements

To run this project locally, the following requirements must be met:

Java JDK 17

Apache Maven 3.8+

Google Chrome browser

Internet connection

No manual WebDriver setup is required (Selenium Manager is used).

How to verify requirements (command line)
Check Java version
java -version


Expected:

java 17.x

Check Maven installation
mvn -version


Expected:

Apache Maven 3.x
Java version: 17

Check Chrome installation
chrome --version


(or google-chrome --version depending on OS)

How to run tests
Run tests in normal (headed) mode
mvn test

Run tests in headless mode
mvn test -Dheadless=true

Test design highlights

Page Object Model + PageFactory

Explicit waits only (no implicit waits)

Retry & page load synchronization (document.readyState)

Data-driven tests using JUnit 5 @ParameterizedTest

Exact message assertion (string equality, not contains)

Clean project structure

Maven-based execution (CI-ready)

Project structure
src/test/java
└── pl.ageno.tests
    ├── base
    │   ├── BaseTest.java
    │   └── DriverFactory.java
    ├── pages
    │   └── ContactPage.java
    └── ContactFormEmailValidationTest.java

Purpose of this project

This repository demonstrates:

practical Selenium WebDriver usage

clean test automation architecture

ability to design stable UI tests

understanding of real-world form validation

readiness for Test Automation Engineer responsibilities
