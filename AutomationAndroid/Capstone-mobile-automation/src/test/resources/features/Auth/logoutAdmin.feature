@LogoutAdmin
Feature: Logout Admin
  As a user
  I want to logout
  So that I can access my account admin

  Scenario: Logout admin scenario
    Given I am on the Logged Admin account
    When I validate dashboard admin page
    And click logout button
    Then I get logout account admin