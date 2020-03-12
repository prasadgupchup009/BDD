Feature: Cucumber can convert a Gherkin data table to a list of a type you specify.

  Scenario: The sum of a list of numbers should be calculated
    Given a list of numbers
      | 17   |
      | 42   |
    When I summarize them
    Then should I get 59

  Scenario: The Sum of datatable numbers should be calculated
    Given A data table of numbers
      |Number1 | Number2 |
      | 17     | 42      |
    When I Add them
    Then I should get 59
