@UpdateScheduleDoctor
Feature: Update Schedule Doctor

  Scenario Outline: PUT - As an doctor I have to be able to update data schedule
    Given I set an "<endpoint>" for update data schedule doctor
    When I request input "<field>" for update data schedule doctor
    Then I validate the status code for update schedule doctor is <statusCode>
    And validate the data detail schedule doctor and "<message>" after update schedule doctor
    Examples:
      | endpoint  |  field          | statusCode | message    |
      | valid     | nullControl     | 500        | error      |
      | valid     | nullNote        | 500        | error      |
      | valid     | nullDiagnosa    | 500        | error      |
      | valid     | invalidControl  | 400        | badRequest |
      | valid     | stringControl   | 400        | badRequest |
      | invalid   | invalidEndpoint | 404        | notFound   |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |