@DeletePatientData
Feature: Delete Data Pasien - Admin

  @NoDeletePatientData
  Scenario Outline: As a admin i want to delete data pasien - No
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data pasien
    Then Click Delete Patient data
    And Click button hapus tidak
    And Valid data delete pasien
    Examples:
      |   email   |password   |
      |admin      |admin123   |

  @YesDeletePatientData
  Scenario Outline: As a admin i want to delete data pasien - Yes
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data pasien
    Then Click Delete Patient data
    And Click button hapus ya
    And Valid data delete pasien
    Examples:
      |   email   |password   |
      |admin      |admin123   |
