@Register
Feature: Create Account Doctor

  Scenario Outline: POST - As an admin I have to be able to create new account doctor
    Given I set an endpoint for register
    When I request input "<field>" for regis new account doctor
    Then I validate the status code for regis new account doctor is <statusCode>
    And validate the data detail register and "<message>" after create new account doctor
    Examples:
      | field        | statusCode | message   |
      | nullUser     | 500        | error     |
      | nullPass     | 500        | error     |
      | nullAll      | 500        | error     |
#      | invalidUser  | 403        | error     |
#     | valid        | 200        | success   |