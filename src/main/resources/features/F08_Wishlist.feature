@smokexx
Feature: F08_Wishlist | user click on a products wishlist button

  Scenario: user click on wishlist product button and shows success message
    When user click wishlist product button
    Then user checks success message

  Scenario: user click on wishlist link button and shows success message
    When user click wishlist product button
    And  user checks success message
    And  user click wishlist link button
    Then user checks if quantity changed