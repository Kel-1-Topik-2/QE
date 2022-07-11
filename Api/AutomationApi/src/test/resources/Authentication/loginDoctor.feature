@LoginDoctor
Feature: Login Account Doctor

  Scenario Outline: POST - As an admin I have to be able to access account doctor
    Given I set an endpoint for login account doctor
    When I request input "<field>" for login account doctor
    Then I validate the status code for login doctor is <statusCode>
    And validate the data detail login doctor and "<message>" login doctor
    Examples:
      | field        | statusCode | message   |
      | nullUser     | 403        | error     |
      | nullPass     | 403        | error     |
      | nullAll      | 403        | error     |
      | invalidUser  | 403        | error     |
      | invalidPass  | 403        | error     |
      | invalidAll   | 403        | error     |
      | valid        | 200        | success   |