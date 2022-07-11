@DeleteDoctor
Feature: Delete By Id Doctor

  Scenario Outline: DELETE - As an admin I have to be able to delete data doctor by id
    Given I set an "<endpoint>" for Delete doctor by id
    When I request "<param>" for Delete detail doctor by id
    Then I validate the status code for Delete doctor is <statusCode>
    And validate the data detail doctor and "<message>" after delete doctor
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
#      | valid    | dataValid   | 200        | success   |