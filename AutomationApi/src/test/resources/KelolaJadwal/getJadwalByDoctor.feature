@GetScheduleByDoctor
Feature: Get Schedule By Doctor

  Scenario: Get Schedule By Doctor
    Given I set endpoint for get schedule by token doctor
    When I request get schedule doctor
    Then verify status code doctor data schedule is 200
    And I validate data detail after get data schedule doctor