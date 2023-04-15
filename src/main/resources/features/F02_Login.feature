@smoke
  Feature: F02_Login | users could use login functionality to use their accounts

    Scenario Outline: user could login with valid and invalid email and password
    Given user go to login page
    When  user login with data "<email>" and "<password>"
    And   user press on login button
    Then  user login to the system successfully

  Examples:
  |email|password|
  |test10101@example.com|P@ssw0rd|
  |wrong@example.com|P@ssw0rd|

