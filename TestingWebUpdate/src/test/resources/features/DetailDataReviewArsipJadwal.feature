@DetailReviewArsipJadwal
Feature: Detail Review Arsip Jadwal - Admin

  Scenario Outline: As a admin i want to Review archive
    Given Open login page
    And I input "<email>" login email valid
    And I input "<password>" login password valid
    When I click button login
    And Login validation invalid
    Then Click button archive
    And Click icon aksi on archive
    And Validate review
    Examples:
      |   email   |password   |
      |   admin   |admin123   |