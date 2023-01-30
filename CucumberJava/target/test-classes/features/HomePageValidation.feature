Feature: Validate Fleet home page

  Scenario: Validate registration link on Fleet home page
    Given browser is open
    When user enters fleet site url and hit enter
    Then user navigates to Fleet home page
    And user clicks on register link
