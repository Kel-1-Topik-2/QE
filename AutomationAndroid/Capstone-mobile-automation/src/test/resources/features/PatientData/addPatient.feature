@AddPatient
Feature: Add Patient
  As a Admin
  I want to Add List Patient
  So that I can access Add Patient Page

  Scenario Outline: Add Patient scenario
    Given I am on the logged account admin
    And I click add data in data patient
    When I input field "<fullName>" with "<numberPhone>"
    And I input "<nik>" with "<usia>" and "<address>"
    And click save patient button
    Then I get the "<output>" add patient
    Examples:
      |fullName    |numberPhone     |nik               |usia        |address   |output              |
      |            |085703005580    |2357907101660100  |22          |new       |Empty fullName      |
      |Hakim Ahmad |                |2357907101660100  |22          |new       |Empty numberPhone   |
      |Hakim Ahmad |085703005580    |                  |22          |new       |Empty nik           |
      |Hakim Ahmad |085703005580    |2357907101660100  |            |new       |Empty usia          |
      |Hakim Ahmad |085703005580    |2357907101660100  |22          |          |Empty address       |
      |            |                |                  |            |          |Empty all           |
      |Hakim Ahmad |Phone Number Is |2357907101660100  |22          |new       |Invalid numberPhone |
      |Hakim Ahmad |085703005580    |Nomer Induk       |22          |new       |Invalid nik         |
      |Hakim Ahmad |085703005580    |2357907101660100  |lima tahun  |new       |Invalid usia        |
      |Hakim Ahmad |Phone Number Is |Nomer Induk       |lima tahun  |new       |Invalid all         |
      |newPatient  |newPhone        |newNik            |newUsia     |newAddress|Success             |