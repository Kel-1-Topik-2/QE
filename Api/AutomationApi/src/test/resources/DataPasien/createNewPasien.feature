@CreateNewPatient
Feature: Create New Patient

  Scenario Outline: POST - As an admin I have to be able to add data patient
    Given I set an endpoint for create patient
    When I request input "<field>" for create data patient
    Then I validate the status code for create patient is <statusCode>
    And validate the data detail patient and "<message>" after create patient
    Examples:
      | field       | statusCode | message   |
      | nullName    | 500        | error     |
      | nullNik     | 500        | error     |
      | nullUmur    | 500        | error     |
      | nullGender  | 500        | error     |
      | nullPhone   | 500        | error     |
      | nullAll     | 500        | error     |
#      | valid       | 200        | success   |