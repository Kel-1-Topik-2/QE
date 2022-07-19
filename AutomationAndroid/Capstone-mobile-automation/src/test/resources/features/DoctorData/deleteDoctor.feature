@DeleteDoctor
Feature: Delete Doctor
  As a Admin
  I want to Delete Data Doctor
  So that I can access Delete Doctor From the list

  Scenario: Delete Doctor scenario
    Given I am the logged Account admin
    When I click button delete in data doctor
    Then I get success delete doctor from the list
