@ViewPatient
Feature: View Patient
  As a Admin
  I want to View List Patient
  So that I can access List Patient

  Scenario: View Patient scenario
    Given I am the logged Admin account
    When I click button data patient
    Then I get The view list patient