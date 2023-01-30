Feature: check login functionality

@smoke
  Scenario: scenario 1
    Given user is on login page
    When user enter valid usename and password
    And clicks on login button
    Then user navigated to the home page

  Scenario: scenario 2
    Given user is on login page
    When user enter valid usename and password
    And clicks on login button
    Then user navigated to the home page
