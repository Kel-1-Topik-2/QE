@GetAllUser
Feature: Get All User

  Scenario: Get All User
    Given I set endpoint for get list user
    When I request get list user
    Then verify status code user is 200
    And I validate data detail after get user