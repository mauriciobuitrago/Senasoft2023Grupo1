Feature: Reservation
  I as user want to search an economical hotel with the filters i want

  Background:
    Given user is on the web page

  Scenario: Successful Reservation
    Given user enter the information
    When user enter the filers
    Then user should see the most economical hotel

  Scenario: Unsuccessful Search
    Given user doesn't enter the information correctly
    Then user should see an alert
