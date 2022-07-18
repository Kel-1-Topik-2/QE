@CreateNewSchedule
Feature: Create New Schedule

  Scenario Outline: POST - As an admin I have to be able to add data schedule
    Given I set an endpoint for create schedule
    When I request input "<field>" for create data schedule
    Then I validate the status code for create schedule is <statusCode>
    And validate the data detail schedule and "<message>" after create schedule
    Examples:
      | field         | statusCode | message   |
      | invalidId     | 500        | error     |
      | emptyDate     | 500        | error     |
##     | emptyPerawatan| 500        | error     |
      | emptyAll      | 500        | error |
      | nullAll       | 500        | error     |
      | invalidPerawatan| 500      | error     |
      | invalidAntrian | 500        | error     |
      | stringDate    | 400        | badRequest|
      | invalidDate   | 400        | badRequest|
      | invalidAll    | 400        | badRequest|
      | valid         | 200        | success   |

##Notes untuk yang ditanda ini berarti masih bugs dan belum ada validasi dari Be