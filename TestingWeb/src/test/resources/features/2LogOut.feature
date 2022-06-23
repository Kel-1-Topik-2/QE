#@LogOut
#Feature: LogOut Acount Admin dan Dokter
#
#  @LogOutAccountAdmin
#  Scenario Outline: As a Admin I want logout
#    Given User selects dokter role
#    When I input "<username>" login email
#    And I input "<password>" login password
#    Then I click button login
#    And Click icon logout account
#    Examples:
#      |username|password|
#      |bagas|123     |
#
#  @LogOutAccountDokter
#  Scenario Outline: As a Dokter I want logout
#    Given User selects dokter role
#    When I input "<username>" login email
#    And I input "<password>" login password
#    Then I click button login
#    And Click icon logout account
#    Examples:
#      |username|password|
#      |bagas|123     |