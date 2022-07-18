@GetAllPatient
Feature: Get All Patient

  Scenario: Get All Patient
    Given I set endpoint for get list patient
    When I request get list patient
    Then verify status code patient is 200
    And I validate data detail after get patient