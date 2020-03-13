@sub
Feature: Cucumber can convert a Gherkin data table to a list of a type you specify.


  Scenario: The sum of a list of numbers should be calculated
    Given I have Numbers below
      |Number1 | Number2 |
      | 10   | 5 |
    When I perform substraction
    Then should I get the  value