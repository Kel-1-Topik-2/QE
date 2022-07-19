@DeleteDokterData
Feature: Delete Data Dokter - Admin

  @NoDeleteDokterData
  Scenario Outline: As a admin i want to delete data dokter - No
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click Delete dokter data
    And Click button hapus tidak
    And Valid data delete dokter
    Examples:
      |   email   |password   |
      |admin      |admin123   |

  @YesDeleteDokterData
  Scenario Outline: As a admin i want to delete data dokter - Yes
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    And Click button data dokter
    Then Click Delete dokter data
    And Click button hapus ya
    And Valid data delete dokter
    Examples:
      |   email   |password   |
      |admin      |admin123   |