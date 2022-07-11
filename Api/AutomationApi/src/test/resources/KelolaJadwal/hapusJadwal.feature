@DeleteSchedule
Feature: Delete By Id Schedule

  Scenario Outline: DELETE - As an admin I have to be able to delete data schedule by id
    Given I set an "<endpoint>" for Delete schedule by id
    When I request "<param>" for Delete detail schedule by id
    Then I validate the status code for Delete schedule is <statusCode>
    And validate the data detail schedule and "<message>" after delete schedule
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
#      | valid    | dataValid   | 200        | success   |