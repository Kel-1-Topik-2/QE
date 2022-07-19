@ViewListReview
Feature: View List Review
  As a Doctor
  I want to View List Review Patient
  So that I can access List Review Patient

  Scenario: View List Review scenario
    Given I am the Logged level Doctor account
    When I click button view more
    Then I get view list review patient