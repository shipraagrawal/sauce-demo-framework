Feature: Login
  As a user
  I want to log in to the website, select the highest price item and add it to the basket
  So that I can access my account

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter my username and password
    Then I am logged in