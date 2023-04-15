@smoke
  Feature: F06_homeSliders | user clicks on the home slider images and navigate to the corresponding product Url

    Scenario: user click on the nokia slider image
      When user click on slider image nokia
      Then user navigate to product url "https://demo.nopcommerce.com/nokia-lumia-1020"

    Scenario: user click on the iphone slider image
      When user click on slider image iphone
      Then user navigate to product url "https://demo.nopcommerce.com/iphone-6"