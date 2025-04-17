Feature: Login functionality
  @UI @Run
  Scenario: Valid login functionality
    Given user insert username
    And user insert password
    When user clicks on Login button
    Then user is redirect to homepage
    And user clicks on Log0ut button

  Scenario: InValid login functionality