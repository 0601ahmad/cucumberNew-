Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open now
    And user is on login page now
    When user enters <username> and <password> after
    And user clicks on login
    Then user is navigated to the home page now

    Examples: 
      | username | password |
      | testOne  |   123456 |
      | TestTow  |    54321 |
      
