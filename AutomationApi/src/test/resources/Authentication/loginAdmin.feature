@LoginAdmin
Feature: Login Account Admin

  Scenario Outline: POST - As an admin I have to be able to access account admin
    Given I set an endpoint for login account admin
    When I request input "<field>" for login account admin
    Then I validate the status code for login admin is <statusCode>
    And validate the data detail login admin and "<message>" login admin
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