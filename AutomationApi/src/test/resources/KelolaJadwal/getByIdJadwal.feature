@GetByIdSchedule
Feature: Get By Id Schedule

  Scenario Outline: GET - As an admin I have to be able to get schedule by id
    Given I set an "<endpoint>" for GET schedule by id
    When I request "<param>" for GET detail schedule by id
    Then I validate the status code for GET schedule by id is <statusCode>
    And validate the data detail schedule and "<message>"
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
#      | valid    | dataValid   | 200        | success   |