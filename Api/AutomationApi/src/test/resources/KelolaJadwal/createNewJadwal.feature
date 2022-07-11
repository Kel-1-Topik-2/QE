@CreateNewSchedule
Feature: Create New Schedule

  Scenario Outline: POST - As an admin I have to be able to add data schedule
    Given I set an endpoint for create schedule
    When I request input "<field>" for create data schedule
    Then I validate the status code for create schedule is <statusCode>
    And validate the data detail schedule and "<message>" after create schedule
    Examples:
      | field         | statusCode | message   |
      | nullId        | 500        | error     |
      | invalidId     | 500        | error     |
      | nullAntrian   | 500        | error     |
      | nullDate      | 500        | error     |
      | nullAll       | 500        | error     |
      | stringDate    | 400        | badRequest|
      | invalidDate   | 400        | badRequest|
#      | valid         | 200        | success   |