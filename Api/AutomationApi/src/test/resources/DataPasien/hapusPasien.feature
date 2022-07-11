@DeletePatient
Feature: Delete By Id Patient

  Scenario Outline: DELETE - As an admin I have to be able to delete data patient by id
    Given I set an "<endpoint>" for Delete patient by id
    When I request "<param>" for Delete detail patient by id
    Then I validate the status code for Delete patient is <statusCode>
    And validate the data detail patient and "<message>" after delete patient
    Examples:
      | endpoint | param       | statusCode | message   |
      | empty    | dataNull    | 400        | error     |
      | invalid  | dataInvalid | 404        | notFound  |
#      | valid    | dataValid   | 200        | success   |