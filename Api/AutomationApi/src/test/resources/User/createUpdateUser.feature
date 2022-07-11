@CreateUpdateUser
Feature: Create Update User

  Scenario Outline: PUT - As an admin I have to be able to update data user
    Given I set an "<endpoint>" for update data user
    When I request input "<field>" for update data user
    Then I validate the status code for update user is <statusCode>
    And validate the data detail user and "<message>" after update user
    Examples:
      | endpoint  |  field          | statusCode | message    |
      | valid     | nullUsername    | 500        | error      |
      | valid     | nullPassword    | 500        | error      |
      | valid     | nullAll         | 500        | error      |
      | invalid   | invalidEndpoint | 404        | notFound   |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |