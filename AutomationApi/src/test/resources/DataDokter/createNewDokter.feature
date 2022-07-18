@CreateNewDoctor
Feature: Create New Doctor

  Scenario Outline: POST - As an admin I have to be able to add data doctor
    Given I set an endpoint for create doctor
    When I request input "<field>" for create data doctor
    Then I validate the status code for create doctor is <statusCode>
    And validate the data detail doctor and "<message>" after create doctor
    Examples:
      | field         | statusCode | message    |
      | emptyName     | 500        | error      |
      | emptySpesialis| 500        | error      |
      | emptySrp      | 500        | error      |
      | emptyAll      | 500        | error      |
      | nullAll       | 500        | error      |
      | invalidId     | 500        | error      |
      | invalidName   | 500        | error      |
     | invalidSpesialis | 500     | error      |
      | invalidSrp    | 400        | badRequest |
      | invalidAll    | 400        | badRequest |
      | valid         | 200        | success    |
