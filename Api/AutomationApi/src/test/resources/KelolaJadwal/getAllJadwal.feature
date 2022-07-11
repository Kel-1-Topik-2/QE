@GetAllSchedule
Feature: Get All Schedule

  Scenario: Get All Schedule
    Given I set endpoint for get list schedule
    When I request get list schedule
    Then verify status code schedule is 200
    And I validate data detail after get schedule