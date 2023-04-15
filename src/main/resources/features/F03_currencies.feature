@smoke
  Feature: F03_Currencies | Check if product currency changed when changing the currency
    Scenario: Change currency to Euro
      When change currency to euro
      Then check products price