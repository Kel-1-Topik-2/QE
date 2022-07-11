@DeleteUser
Feature: Delete By Id User

  Scenario Outline: DELETE - As an admin I have to be able to delete data user by id
    Given I set an "<endpoint>" for Delete user by id
    When I request "<param>" for Delete detail user by id
    Then I validate the status code for Delete user is <statusCode>
    And validate the data detail user and "<message>" after delete user
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
#      | valid    | dataValid   | 200        | success   |