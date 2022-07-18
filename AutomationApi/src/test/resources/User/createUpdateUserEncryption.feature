@CreateUpdateUserEncryption
Feature: Create Update User Encryption

  Scenario Outline: PUT - As an admin I have to be able to update data user encryption
    Given I set an "<endpoint>" for update data user encryption
    When I request input "<field>" for update data user encryption
    Then I validate the status code for update user encryption is <statusCode>
    And validate the data detail user encryption and "<message>" after update user encryption
    Examples:
      | endpoint  |  field          | statusCode | message    |
##      | valid     | emptyUsername    | 500        | error      |
##      | valid     | emptyPassword    | 500        | error      |
##      | valid     | emptyAll         | 500        | error      |
#      | valid     | nullAll         | 500        | error      |
      | invalid   | invalidEndpoint | 500        | error      |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |


##Notes untuk yang ditanda ini berarti masih bugs dan belum ada validasi dari Be