@SearchDoctor
Feature: Search Doctor
  As a Admin
  I want to Search Doctor
  So that I can Searching Doctor

 Scenario Outline: Search Doctor scenario
    Given I am on the logged level Account Admin
    When I searching "<data>" in data doctor
    Then I get the "<outcome>" search doctor
    Examples:
      |data     |outcome |
      |dokter   |success |
      |@$       |failed  |