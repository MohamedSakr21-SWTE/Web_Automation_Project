@smoke
  Feature: F04_Search | Search for products based name or Sku

    Scenario Outline: user could search using product name
      When user enter product data "<productSearch>"
      And user click on search button
      Then user check if product name is displayed "<productSearch>"
      Examples:
      |productSearch|
      |book|
      |laptop|
      |nike|


    Scenario Outline: user could search for product using sku
      When  user enter product data "<productSearch>"
      And   user click on search button
      And   user click on product
      Then  check product sku "<productSearch>"

      Examples:
      |productSearch|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|