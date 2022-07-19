@LoginAdmin
Feature: Login Admin
  As a user
  I want to login
  So that I can access my dashboard admin

  Scenario Outline: Login admin scenario
    Given I am on the login page
    And I choose role admin
    When I input "<username>" with "<password>"
    And click login button
    Then I get the "<result>"
    Examples:
      |username |password |result           |
      |admin    |admin123 |Success          |
      |         |Admin    |Empty Username   |
      |Admin    |         |Empty Password   |
      |         |         |Empty All        |
      |admin12  |Admin    |Invalid Username |
      |Admin    |admin15  |Invalid Password |
      |admin22  |admin15  |Invalid All      |