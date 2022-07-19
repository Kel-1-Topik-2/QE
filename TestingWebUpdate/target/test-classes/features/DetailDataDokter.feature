@DetailDokterData
Feature: Detail Data Dokter - Admin

    Scenario Outline: As a admin i want to detail data dokter
      Given Open login page
      And I input "<email>" login email valid
      And I input "<password>" login password valid
      When I click button login
      And Login validation invalid
      And Click button data dokter
      Then Click Detail dokter data
      And Valid data detail dokter
      Examples:
        |   email   |password   |
        |admin      |admin123   |