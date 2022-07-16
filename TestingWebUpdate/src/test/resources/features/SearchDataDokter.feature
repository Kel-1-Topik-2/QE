@SearchDokterData
Feature: Search Data Dokter - Admin

  Scenario Outline: As a admin i want to delete data dokter
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click search all category dokter data
    And Click chose nama dokter
    And Input data "<namacategory>" category
    And Valid data category pasien
    Examples:
      |   email   |password   |namacategory|
      |admin      |admin123   |    Bagas   |
      |admin      |admin123   | &%^%^*)%   |