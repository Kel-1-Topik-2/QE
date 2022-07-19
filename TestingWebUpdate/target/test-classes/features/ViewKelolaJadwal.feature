@ViewKelolaJadwal
Feature: View Kelola Jadwal - Admin

  Scenario Outline: As a admin i want to View Manage Schedule
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button manage schedule
    And View manage schedule
    Examples:
      |   email   |password   |
      |admin      |admin123   |