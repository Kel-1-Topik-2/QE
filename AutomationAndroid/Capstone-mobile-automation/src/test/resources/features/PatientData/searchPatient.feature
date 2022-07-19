@SearchPatient
Feature: Search Patient
  As a Admin
  I want to Search Patient
  So that I can Searching Patient

  Scenario Outline: Search Patient scenario
    Given I am on the logged Account Admin
    When I searching "<data>" in data patient
    Then I get the "<outcome>" search patient
    Examples:
      |data |outcome |
      |1    |success |
      |@$   |failed  |