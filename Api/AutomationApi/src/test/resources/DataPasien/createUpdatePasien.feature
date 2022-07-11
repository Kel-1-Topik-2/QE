@CreateUpdatePatient
Feature: Create Update Patient

  Scenario Outline: PUT - As an admin I have to be able to update data patient
    Given I set an "<endpoint>" for update data patient
    When I request input "<field>" for update data patient
    Then I validate the status code for update patient is <statusCode>
    And validate the data detail patient and "<message>" after update patient
    Examples:
      | endpoint  |  field          | statusCode | message    |
      | valid     | nullName        | 500        | error      |
      | valid     | nullNik         | 500        | error      |
      | valid     | nullUmur        | 500        | error      |
      | valid     | nullGender      | 500        | error      |
      | valid     | nullPhone       | 500        | error      |
      | valid     | nullAll         | 500        | error      |
      | invalid   | invalidEndpoint | 404        | notFound   |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |