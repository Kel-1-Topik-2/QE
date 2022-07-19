@SearchKelolaJadwal
Feature: Search Kelola Jadwal - Admin

  Scenario Outline: As a admin i want to search manage schedule
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button manage schedule
    And Click search all category manage schedule
    Then Click chose nama pasien
    And Input data "<namacategory>" category
    And Valid data category archive
    Examples:
      |   email   |password   |namacategory|
      |   admin   |admin123   |    bagas   |
      |   admin   |admin123   |  &%^%^*)%  |