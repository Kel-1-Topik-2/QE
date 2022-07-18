@GetAllDoctor
Feature: Get All Doctor

  Scenario: Get All Doctor
    Given I set endpoint for get list doctor
    When I request get list doctor
    Then verify status code doctor is 200
    And I validate data detail after get doctor