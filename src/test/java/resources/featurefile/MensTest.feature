@regression
Feature: Men page functionality
  As a user I want to check all Mens page functionality

  Background:I am on homepage
    And I Mouse Hover on Men Menu and Mouse Hover on Bottoms and Click on Pants

  @smoke
  Scenario Outline:I should add product successFully to shopping cart
    When I Mouse Hover on product name Cronus Yoga Pant and click on size.
    And I Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    And I Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.
    And Verify the text You added Cronus Yoga Pant to your shopping cart "<message>"
    And I Click on shopping cart Link into message
    And I verify the text Shopping Cart "<Shopping Cart>".
    And I verify the product name "<Product name>"
    And I verify the product size "<size>"
    Then I verify the product colour "<color>"

    Examples:
      | message                                           | Shopping Cart | Product name     | size | color |
      | You added Cronus Yoga Pant to your shopping cart. | Shopping Cart | Cronus Yoga Pant | 32   | Black |