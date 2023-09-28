Feature: Register
  I as user want to register on the web page

  Scenario: Successful Register
    Given user is on the web page
    When user enter the credentials
    Then user could see your name

  Scenario: Unsuccessful Register
    Given user is on the web page
    When user doesn't enter all credentials
    Then user will not be able to log in

