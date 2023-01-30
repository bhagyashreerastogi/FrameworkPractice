@mustRun
Feature: Feature to demo tags

  @smoke
  Scenario: Sample 1
    Given user is on home page
    When user clicks login
    Then user navigates to login page

  @regression
  Scenario: Sample 2
    Given user is on home page
    When user clicks login
    Then user navigates to login page

  @smoke @regression
  Scenario: Sample 3
    Given user is on home page
    When user clicks login
    Then user navigates to login page

  @important
  Scenario: Sample 4
    Given user is on home page
    When user clicks login
    Then user navigates to login page

  @important @regression
  Scenario: Sample 5
    Given user is on home page
    When user clicks login
    Then user navigates to login page
