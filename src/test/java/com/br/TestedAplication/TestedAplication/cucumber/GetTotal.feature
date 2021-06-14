@tag
Feature: Verify functions from ShoppingCart class

  @tag1
  Scenario: Verify the total value from cart
    Given I chosse some books
    When I add these books to the cart
    Then the total must be updated

