@CreateUpdateDoctor
Feature: Create Update Doctor

  Scenario Outline: PUT - As an admin I have to be able to update data doctor
    Given I set an "<endpoint>" for update data doctor
    When I request input "<field>" for update data doctor
    Then I validate the status code for update doctor is <statusCode>
    And validate the data detail doctor and "<message>" after update doctor
    Examples:
      | endpoint  |  field          | statusCode | message    |
#      | valid     | emptyName       | 500        | error      |
#      | valid     | emptySpesialis  | 500        | error      |
#      | valid     | emptySrp        | 500        | error      |
#      | valid     | emptyAll        | 500        | error      |
#      | valid     | nullAll         | 500        | error      |
#      | valid     | invalidId       | 500        | error      |
#      | valid     | invalidName     | 500        | error      |
#      | valid     | invalidSpesialis| 500        | error      |
#      | valid     | invalidSrp      | 500        | error  |
#      | valid     | invalidAll      | 400        | badRequest  |
      | invalid   | invalidEndpoint | 500        | error   |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |

##Notes untuk yang ditanda ini berarti masih bugs dan belum ada validasi dari Be