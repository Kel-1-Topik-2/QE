@UpdateScheduleAdmin
Feature: Update Schedule Admin

  Scenario Outline: PUT - As an admin I have to be able to update data schedule
    Given I set an "<endpoint>" for update data schedule admin
    When I request input "<field>" for update data schedule admin
    Then I validate the status code for update schedule admin is <statusCode>
    And validate the data detail schedule admin and "<message>" after update schedule admin
    Examples:
      | endpoint  |  field          | statusCode | message    |
      | valid     | nullId          | 500        | error      |
      | valid     | invalidId       | 500        | error      |
      | valid     | nullAntrian     | 500        | error      |
      | valid     | nullDate        | 500        | error      |
      | valid     | invalidDate     | 400        | badRequest |
      | valid     | stringDate      | 400        | badRequest |
      | valid     | nullAll         | 500        | error      |
      | invalid   | invalidEndpoint | 500        | error      |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |