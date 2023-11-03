Feature: Practice test login

  Scenario: To test login functionality with valid data
    Given Open practice test page
    When Enter valid username
    When Enter valid password
    And Click on login button
    Then user should login

  Scenario: To test login functionality with invalid data
    Given Open practice test page in browser
    When Enter invalid username
    When Enter invalid password
    And Click on login btn
    Then error message should display
