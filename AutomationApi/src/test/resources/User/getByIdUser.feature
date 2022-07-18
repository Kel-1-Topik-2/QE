@GetByIdUser
Feature: Get By Id User

  Scenario Outline: GET - As an admin I have to be able to get user by id
    Given I set an "<endpoint>" for GET user by id
    When I request "<param>" for GET detail user by id
    Then I validate the status code for GET user by id is <statusCode>
    And validate the data detail user and "<message>"
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
#      | valid    | dataValid   | 200        | success   |