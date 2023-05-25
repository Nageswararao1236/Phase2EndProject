@AddtoCart
Feature: Adding item to cart feature

  Background: 
    Given I launch the SauceLabs Application
    When I enter the username as "standard_user"
    And I enter the password as "secret_sauce"
    And I cick on Login
    Then I should be landed on Home Page

  Scenario: Verify the item in the cart
    When I click on product name as "Sauce Labs Bike Light"
    And I click on Add to cart
    And I click on shopping cart
    Then I verify the cart item
