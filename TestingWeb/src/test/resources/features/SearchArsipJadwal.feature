@SearchArsipJadwal
Feature: Search Arsip Jadwal - Admin

  Scenario Outline: As a admin i want to search archive
    Given Open page archive
    And Click search all category archive
    When Click chose nama
    And Input data "<namacategory>" category
    Then Valid data category archive
    Examples:
      |namacategory|
      |    bagas   |
      |  &%^%^*)%  |