#@LoginAndLogOut
#Feature: Login and LogOut
#
#  @LoginAdmin
#  Scenario Outline: As a admin I login
#    Given User selects admin role
#    When I input "<username>" login email
#    And I input "<password>" login password
#    Then I click button login
#    And Login validation "<text>"
#  Examples:
#      |username|password|text|
#      |bagas   |123     |pass|
##      |        |321     |none|
##      |bagas   |        |none|
##      |        |        |none|
##      |invalid |invalid |none|
##      |valid   |invalid |none|
##      |invalid |valid   |none|
#
#  @LoginDokter
#  Scenario Outline: As a Dokter I login
#    Given User selects dokter role
#    When I input "<username>" login email
#    And I input "<password>" login password
#    Then I click button login
#    And Login validation "<text>"
#  Examples:
#      |username|password|text|
#      |bagas   |123     |pass|
##      |        |321     |none|
##      |bagas   |        |none|
##      |        |        |none|
##      |invalid |invalid |none|
##      |valid   |invalid |none|
##      |invalid |valid   |none|
#
