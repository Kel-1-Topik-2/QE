@ViewDokterData
Feature: View Data Dokter - Admin

  Scenario Outline: As a admin i want to view data dokter
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button data dokter
    And View Dokter data
    Examples:
      |email   |password   |
      |admin      |admin123   |