@LoginAdmin
Feature: Login Account Admin

  Scenario Outline: POST - As an admin I have to be able to access account admin
    Given I set an endpoint for login account admin
    When I request input "<field>" for login account admin
    Then I validate the status code for login admin is <statusCode>
    And validate the data detail login admin and "<message>" login admin
    Examples:
      | field        | statusCode | message   |
      | nullUser     | 403        | error     |
      | nullPass     | 403        | error     |
      | nullAll      | 403        | error     |
      | invalidUser  | 403        | error     |
      | invalidPass  | 403        | error     |
      | invalidAll   | 403        | error     |
      | valid        | 200        | success   |