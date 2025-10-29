
Feature: feature to test login functionality

@smoketest
  Scenario: Check login is successful with valid crdentials
    Given user is on login page
    When user enters username
    And clicks on login button
    Then user is navigated to the home page

  
