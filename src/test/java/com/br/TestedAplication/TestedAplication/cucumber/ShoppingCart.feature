@tag
Feature: Verify functions from ShoppingCart class

  @tag1
  Scenario: Should Verify the count of items from cart
    Given I choose two books
    When I add these two books to the cart
    Then the count of items from cart must be 2

  @tag2
  Scenario: Should Verify the total value from cart
    Given I choose two books
    When I add these two books to the cart
    Then the total must be updated


