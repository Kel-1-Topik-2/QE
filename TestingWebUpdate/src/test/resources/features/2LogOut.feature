@LogOut
Feature: LogOut Acount - Admin

  @LogOutAccountAdminYes
  Scenario Outline: As a admin I  Logout - Yes
    Given Open login page
    When I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    And Validate on dashboard
    Then Click icon logout account
    And Click icon yes for logout
    And Validate on login page
    Examples:
      |   email   |password   |
      |admin      |admin123   |

  @LogOutAccountAdminNo
  Scenario Outline: As a admin I Logout - No
    Given Open login page
    When I input "<email>" login email valid
    And I input "<password>" login password valid
    And I click button login
    And Login validation invalid
    And Validate on dashboard
    Then Click icon logout account
    And Click icon no for logout
    And Valid not logout
    Examples:
      |   email   |password   |
      |admin      |admin123   |
