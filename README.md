# CucumberExample

A Project utilising Cucumber and the Selenium Webdriver to run a simple test on the BBC login page

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them

```
A version of the Java Development Kit (11 recommended)
An IDE for Java (Intellij recommended)
```

### Installing

A step by step series of examples that tell you how to get a development env running

Clone the repository

```
Using git clone command, acquire a copy of the source code using SSH or HTTPS.
```

Open in Intellij

```
On opening, Maven should automatically download the needed dependencies. If not, initialise a Maven environment from the file menu in Intellij or using your IDE's equivalent.
```

Upon running the main method, a list of Magic: The Gathering sets, including 2 core sets and 6 expert level expansion sets will be printed, as well as a link to a list of cards in those sets on Scryfall.

## Running the tests

Using Maven Integration, the test can be run using the Maven Test function or the test can be run directly from TestRunner.java

### Cucumber Tests

There are 4 user stories tested in this project

```
The tests check the different possible error messages when an incorrect password is input.
1. Password shorter than 8 characters
2. Insecure Password
3. Password without a number/symbol
4. Password without a letter
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **John Shipman** - *Initial work* - [JShipmanSparta19](https://github.com/JShipmanSparta19)
