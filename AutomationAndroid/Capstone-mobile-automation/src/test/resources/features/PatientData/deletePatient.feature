@DeletePatient
Feature: Delete Patient
  As a Admin
  I want to Delete Data Patient
  So that I can access Delete Patient From the list

  Scenario: Delete Patient scenario
    Given I am the logged account admin
    When I click button delete in data patient
    Then I get success delete patient from the list
