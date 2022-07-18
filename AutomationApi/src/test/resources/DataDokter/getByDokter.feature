@GetByTokenDoctor
Feature: Get By Token Doctor

  Scenario: Get By Token Doctor
    Given I set endpoint for get data by token doctor
    When I request get data doctor
    Then verify status code doctor data is 200
    And I validate data detail after get data doctor