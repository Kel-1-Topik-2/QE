@LogoutDoctor
Feature: Logout Dcctor
  As a user doctor
  I want to logout
  So that I can access my account doctor

  Scenario: Logout doctor scenario
    Given I am on the Logged Doctor account
    When I validate dashboard doctor page
    And click logout doctor button
    Then I get logout account doctor