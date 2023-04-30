Feature: Login
  As a user
  I want to log in to the website
  So that I can access my account

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter my username and password
    Then I am logged in


  Scenario: Login and add highest price item to cart
    Given I am on the login page
    When I enter my username and password
    Then I am logged in
    And I add the selected item to the cart
    And I checkout the item
    And I make a successful payment
    Then I should see the payment complete page