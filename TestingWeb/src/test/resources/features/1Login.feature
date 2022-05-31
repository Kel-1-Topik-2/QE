@Login
Feature: Login - as a user i want to buy but i need to login account

  Background:
    Given I am open the login page
    When I am on the login page

    @LoginAdmin
  Scenario Outline: As a admin I login
    And I input "<email>" login email
    And I input "<password>" login password
    Then I click button login
    And Login validation "<text>"
  Examples:
  |email|password|text|
  |bagas|123     |pass|
  |robi |321     |none|

    @LoginDokter
  Scenario Outline: As a admin I login
    And I input "<email>" login email
    And I input "<password>" login password
    Then I click button login
    And Login validation "<text>"
    Examples:
    |email|password|text|
    |bagas|123     |pass|
    |robi |321     |none|