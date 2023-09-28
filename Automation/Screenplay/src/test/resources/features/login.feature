Feature: Login
  I as a user want to log in to the site Booking

  Scenario: login successfully
    Given he user is on the login page
    When he user insert valid credentials
    Then he could see his name in the home page
