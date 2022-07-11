@GetByIdPatient
Feature: Get By Id Patient

Scenario Outline: GET - As an admin I have to be able to get patient by id
  Given I set an "<endpoint>" for GET patient by id
  When I request "<param>" for GET detail patient by id
  Then I validate the status code for GET patient by id is <statusCode>
  And validate the data detail patient and "<message>"
      Examples:
        | endpoint | param       | statusCode | message   |
        | empty    | dataNull    | 400        | error     |
        | invalid  | dataInvalid | 404        | notFound  |
        | valid    | dataValid   | 200        | success   |