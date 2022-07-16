@ViewArsipJadwal
Feature: View Arsip Jadwal - Admin

  Scenario Outline: As a admin i want to View archive
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button archive
    And View archive
    Examples:
      |   email   |password   |
      |   admin   |admin123   |