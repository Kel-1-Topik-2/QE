@SearchPatientData
Feature: Search Data Pasien - Admin

  Scenario Outline: As a admin i want to search data pasien
    Given Open page data pasien
    And Click search all category Patient data
    When Click chose nama
    And Input data "<namacategory>" category
    Then Valid data category pasien
    Examples:
      |namacategory|
      |    bagas   |
      |  &%^%^*)%  |