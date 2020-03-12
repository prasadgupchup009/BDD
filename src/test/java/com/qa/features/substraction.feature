@sub1
Feature: Cucumber can convert a Gherkin data table to a list of a type you specify.


  Scenario: The sum of a list of numbers should be calculated
    Given I have list
      | 10   | 5 |
    When I substract them them
    Then should I get the correct value