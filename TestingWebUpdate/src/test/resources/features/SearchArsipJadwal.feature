@SearchArsipJadwal
Feature: Search Arsip Jadwal - Admin

  Scenario Outline: As a admin i want to search archive
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button archive
    And Click search all category archive
    Then Click chose nama pasien
    And Input data "<namacategory>" category
    And Valid data category archive
    Examples:
      |   email   |password   |namacategory|
      |   admin   |admin123   |    bagas   |
      |   admin   |admin123   |  &%^%^*)%  |