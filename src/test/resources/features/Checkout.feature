@regression
@smokeTest
Feature: Checkout.feature

  Scenario: Verify user can successfully checkout the selected product
    Given I have logged in and am on the products listing page
    When I select a product and click on add to cart button
    And I click on the shopping cart
    And I navigated to the shopping cart
    Then I should see the selected item on the basket
    When I click checkout button on the shopping cart
    And I fill the user information and click continue
      | Field       | Value         |
      | first-name  | TestFirstName |
      | last-name   | TestLastName  |
      | postal-code | Sl2 2AY       |
    Then I navigated to the checkout overview
    And I click finish button on the checkout overview
    Then I get 'Thank you for your order!' response
