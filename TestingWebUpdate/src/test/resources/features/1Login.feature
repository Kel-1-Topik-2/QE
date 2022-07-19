#@Login111
#Feature: Login - Admin
#
#  @LoginAdminKosong
#  Scenario Outline: As a admin I login - kosong
#    Given Open login page
#    When I input "<email>" login email
#    And I input "<password>" login password
#    Then I click button login
#    And Login validation kosong
#  Examples:
#      |   email| password|
#      |bagas   |         |
#      |        | 321     |
#      |        |         |
#
#  @LoginAdminInvalid
#  Scenario Outline: As a admin I login - invalid
#    Given Open login page
#    When I input "<email>" login email
#    And I input "<password>" login password
#    Then I click button login
#    And Login validation invalid
#    Examples:
#      |   email   |password   |
#      |invalid    |invalid    |
#      |admin      |invalid    |
#      |invalid    |admin      |
#
#  @LoginAdminValid
#  Scenario Outline: As a admin I login - Valid
#    Given Open login page
#    When I input "<email>" login email valid
#    And I input "<password>" login password valid
#    Then I click button login
#    And Login validation invalid
#    And Validate on dashboard
#    Examples:
#      |   email   |password   |
#      |admin      |admin123   |