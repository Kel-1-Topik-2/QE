@CreateUpdateDoctor
Feature: Create Update Doctor

  Scenario Outline: PUT - As an admin I have to be able to update data doctor
    Given I set an "<endpoint>" for update data doctor
    When I request input "<field>" for update data doctor
    Then I validate the status code for update doctor is <statusCode>
    And validate the data detail doctor and "<message>" after update doctor
    Examples:
      | endpoint  |  field          | statusCode | message    |
      | valid     | nullName        | 500        | error      |
      | valid     | nullSpesialis   | 500        | error      |
      | valid     | nullSrp         | 500        | error      |
      | valid     | nullAll         | 500        | error      |
      | valid     | invalidId       | 500        | error      |
      | invalid   | invalidEndpoint | 404        | notFound   |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |