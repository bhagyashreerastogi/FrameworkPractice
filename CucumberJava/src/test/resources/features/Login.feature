# Author: bhagyashree.rastogi@publicissapient.com
# Keywords Summary: In this feature file, We have automated Login form and Login to Fleet application functionality.
Feature: Login to Fleet site

  Scenario Outline: Validate login functionality
    Given user is on landing page
    And user enters fleet site url and hit enter
    And user accepts cookies
    And user clicks on register link
    When user login into application with <username> and <password>
    Then user navigates to Home page
    And user name is displayed

    Examples: 
      | username                          | password  |
      #| shashi.achar@sapientrazorfish.com |      1234 |
      | fleetprod1@mailinator.com         | password1 |
