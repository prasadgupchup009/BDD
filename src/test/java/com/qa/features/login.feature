Feature: Opening the Browser
  As A User
  I want to open the browser
  So That I can navigate to flight booking site

  Scenario: Opening the Browser
    Given  The browser is open
    When User logs in
    Then user sees login Page
    And Browser is closed

