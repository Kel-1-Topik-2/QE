@EditPatient
Feature: Edit Patient
  As a Admin
  I want to Edit Detail Patient
  So that I can access Edit Patient Page

  Scenario Outline: Edit Patient scenario
    Given I am on the logged account Admin
    And I click edit data in data patient
    When I input field "<FullName>" and "<NumberPhone>"
    And I input field "<Nik>" with "<Usia>" with and "<Address>"
    And click button save patient
    Then I get the "<Output>" edit patient
    Examples:
      |FullName     |NumberPhone     |Nik               |Usia        |Address   |Output              |
      |             |085694834745    |2357907101660100  |18          |Jl.Merak  |Empty fullName      |
      |Hakim Ahmad  |                |2357907101660100  |18          |Jl.Merak  |Empty numberPhone   |
      |Hakim Ahmad  |085703005580    |                  |18          |Jl.Merak  |Empty nik           |
      |Hakim Ahmad  |085703005580    |2357907101660100  |            |Jl.Merak  |Empty usia          |
      |Hakim Ahmad  |085703005580    |2357907101660100  |18          |          |Empty address       |
      |             |                |                  |            |          |Empty all           |
      |Ahmad Hakim  |Number Phone Is |2357907101660100  |18          |Jl.Merak  |Invalid numberPhone |
      |Ahmad Hakim  |085703005580    |Number Induk      |18          |Jl.Merak  |Invalid nik         |
      |Ahmad Hakim  |085703005580    |2357907101660100  |tiga tahun  |Jl.Merak  |Invalid usia        |
      |Ahmad Hakim  |Number Phone Is |Number Induk      |tiga tahun  |Jl.Merak  |Invalid all         |
      |newPatient   |newPhone        |newNik            |newUsia     |newAddress|Success             |