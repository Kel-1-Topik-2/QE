@CreateUpdatePatient
Feature: Create Update Patient

  Scenario Outline: PUT - As an admin I have to be able to update data patient
    Given I set an "<endpoint>" for update data patient
    When I request input "<field>" for update data patient
    Then I validate the status code for update patient is <statusCode>
    And validate the data detail patient and "<message>" after update patient
    Examples:
      | endpoint  |  field          | statusCode | message    |
##      | valid     | emptyName       | 500        | error      |
##      | valid     | emptyNik        | 500        | error      |
##      | valid     | emptyGender     | 500        | error      |
##      | valid     | emptyPhone      | 500        | error      |
##      | valid     | emptyAddress    | 500        | error      |
##      | valid     | emptyAll        | 500        | error      |
#      | valid     | nullAll         | 500        | error      |
##      | valid     | invalidName     | 500        | error      |
##      | valid     | invalidNik      | 500        | error      |
##      | valid     | invalidPhone    | 500        | error      |
##      | valid     | invalidGender   | 500        | error      |
##      | valid     | invalidAll      | 500        | error      |
      | invalid   | invalidEndpoint | 404        | notFound   |
      | null      | nullEndpoint    | 400        | badRequest |
#      | valid     | validAll        | 200        | success    |

##Notes untuk yang ditanda ini berarti masih bugs dan belum ada validasi dari Be