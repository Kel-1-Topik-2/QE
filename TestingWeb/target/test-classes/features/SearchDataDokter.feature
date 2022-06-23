@SearchDokterData
Feature: Search Data Dokter - Admin

  Scenario Outline: As a admin i want to delete data dokter
    Given Open page data dokter
    And Click search all category dokter data
    When Click chose nama
    And Input data "<namacategory>" category
    Then Valid data category pasien
    Examples:
      |namacategory|
      |    Bagas   |