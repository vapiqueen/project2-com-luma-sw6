@regression
Feature: Gear page functionality
  As a User I want to check all Gear Page Functionality from Luma website

  Background: I am on homepage
    And I Mouse Hover on Gear Menu and I Click on Bags

  @smoke
  Scenario Outline: user should add product successFully to Shopping cart
    When I click on Product Name Overnight Duffle
    And I verify the text Overnight Duffle "<Product Name>"
    And I change Qty
    And I click on Add to Cart Button
    And I verify the text You added Overnight Duffle to your shopping cart "<Verify Product Added Message>"
    And I click on shopping cart Link into message
    And I verify the product name Overnight duffle "<verify product name>"
    And I verify the Qty "<Quantity>"
    And I verify the product price "<product price>"
    And I change quantity "<change Qty>"
    And I click on Update Shopping Cart button
    Then I verify the updated product price "<updated product price>"

    Examples:
      | Product Name     | Verify Product Added Message                      | verify product name | Quantity | product price | change Qty | updated product price |
      | Overnight Duffle | You added Overnight Duffle to your shopping cart. | Overnight Duffle    | 3        | $135.00       | 5          | $225.00               |