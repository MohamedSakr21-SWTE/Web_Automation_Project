@smoke
  Feature: F05_hoverCategories | User hovers over main categories and select a sub-category at random
    Scenario: user can hover over any category and choose sub-category
      When user hover over categories
      And  user clicks on one of the subcategories
      Then user checks if page title equals subcategory name