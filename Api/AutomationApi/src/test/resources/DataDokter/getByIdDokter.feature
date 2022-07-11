@GetByIdDoctor
Feature: Get By Id Doctor

  Scenario Outline: GET - As an admin I have to be able to get doctor by id
    Given I set an "<endpoint>" for GET doctor by id
    When I request "<param>" for GET detail doctor by id
    Then I validate the status code for GET doctor by id is <statusCode>
    And validate the data detail doctor and "<message>"
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
      | valid    | dataValid   | 200        | success   |