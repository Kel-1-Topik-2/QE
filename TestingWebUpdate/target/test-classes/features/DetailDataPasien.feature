@DetailPatientData
Feature: Detail Data Pasien - Admin

  Scenario Outline: As a admin i want to detail data pasien
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button data pasien
    And Click Detail Patient data
    And Valid data detail pasien
    Examples:
      |   email   |password   |
      |admin      |admin123   |