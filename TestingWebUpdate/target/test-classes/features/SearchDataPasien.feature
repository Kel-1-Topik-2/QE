@SearchPatientData
Feature: Search Data Pasien - Admin

  Scenario Outline: As a admin i want to search data pasien
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data pasien
    Then Click search all category Patient data
    And Click chose nama
    And Input data "<namacategory>" category
    And Valid data category pasien
    Examples:
      |   email   |password   | namacategory|
      |admin      |admin123   |     bagas   |
      |admin      |admin123   |  &%^%^*)%   |