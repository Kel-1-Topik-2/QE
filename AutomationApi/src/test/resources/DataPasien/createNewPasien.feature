@CreateNewPatient
Feature: Create New Patient

  Scenario Outline: POST - As an admin I have to be able to add data patient
    Given I set an endpoint for create patient
    When I request input "<field>" for create data patient
    Then I validate the status code for create patient is <statusCode>
    And validate the data detail patient and "<message>" after create patient
    Examples:
      | field        | statusCode | message   |
##      | emptyName    | 500        | error     |
      | emptyNik     | 500        | error     |
##      | emptyGender  | 500        | error     |
      | emptyPhone   | 500        | error     |
      | emptyAll     | 500        | error     |
      | nullAll      | 500        | error     |
##      | invalidName   | 500        | error     |
      | invalidNik   | 400        | badRequest |
      | invalidPhone | 400        | badRequest |
##      | invalidGender| 500        | error     |
      | invalidAll   | 400        | badRequest |
      | valid       | 200        | success   |


##Notes untuk yang ditanda ini berarti masih bugs dan belum ada validasi dari Be