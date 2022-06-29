@DeleteDokterData
Feature: Delete Data Dokter - Admin

  Scenario: As a admin i want to delete data dokter - Yes
    Given Open page data dokter
    When Click Delete dokter data
    And Click button hapus ya
    Then Valid data delete dokter

  Scenario: As a admin i want to delete data dokter - No
    Given Open page data dokter
    When Click Delete dokter data
    And Click button hapus tidak
    Then Valid data delete dokter