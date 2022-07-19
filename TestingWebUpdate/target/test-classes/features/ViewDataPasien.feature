@ViewPatientData
Feature: View Data Pasien - Admin

  Scenario Outline: As a admin i want to view data pasien
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button data pasien
    And View Patient data
    Examples:
      |email      |password   |
      |admin      |admin123   |