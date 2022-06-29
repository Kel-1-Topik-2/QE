@DeletePatientData
Feature: Delete Data Pasien - Admin

  Scenario: As a admin i want to delete data pasien - Yes
    Given Open page data pasien
    When Click Delete Patient data
    And Click button hapus ya
    Then Valid data delete pasien

  Scenario: As a admin i want to delete data pasien - No
    Given Open page data pasien
    When Click Delete Patient data
    And Click button hapus tidak
    Then Valid data delete pasien