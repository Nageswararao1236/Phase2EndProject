@SauceLabs
Feature: SauceDemo Login feature

  Background: 
    Given I  launch the SwagLabs Application

  Scenario: Verify login function with valid username and password
    When I  enter the username as "standard_user"
    And I  enter the password as "secret_sauce"
    And I click on login button
    Then I should be landed on products page

  Scenario Outline: Verify login  function with Invalid username and password
    When I  enter the username as "<username>"
    And I  enter the password as "<password>"
    And I click on login button
    Then I should get the error as "<Error>"

    Examples: 
      | username        | password     | Error                                                                     |
      | standard_user   |        12345 | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
