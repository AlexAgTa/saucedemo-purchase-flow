Feature: Purchase flow on SauceDemo

  Scenario: Successful purchase
    Given user is logged in with username "standard_user" and password "secret_sauce"
    When user adds the following items to the cart:
      | Sauce Labs Backpack    |
      | Sauce Labs Bike Light  |
    And user completes the purchase form with name "John Doe", country "USA", city "New York", card "4111 1111 1111 1111", month "12", and year "2025"
    Then the purchase should be successful
