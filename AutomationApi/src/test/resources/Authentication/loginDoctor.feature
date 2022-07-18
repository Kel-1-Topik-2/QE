@LoginDoctor
Feature: Login Account Doctor

  Scenario Outline: POST - As an admin I have to be able to access account doctor
    Given I set an endpoint for login account doctor
    When I request input "<field>" for login account doctor
    Then I validate the status code for login doctor is <statusCode>
    And validate the data detail login doctor and "<message>" login doctor
    Examples:
      | field        | statusCode | message   |
      | emptyUser    | 403        | error     |
      | emptyPass    | 403        | error     |
      | emptyRole    | 400        | badRequest|
      | emptyAll     | 400        | badRequest|
      | nullAll      | 403        | error     |
      | invalidUser  | 403        | error     |
      | invalidPass  | 403        | error     |
      | invalidRole  | 400        | badRequest|
      | invalidAll   | 400        | badRequest|
      | valid        | 200        | success   |