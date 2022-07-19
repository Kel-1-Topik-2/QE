@SearchArchiveSchedule
Feature: Search Archive Schedule
  As a Admin
  I want to Search Archive Schedule
  So that I can Searching Archive Schedule

  Scenario Outline: Search Archive Schedule scenario
    Given I am on the Logged level Account Admin
    When I searching "<Data>" in archive schedule data
    Then I get "<Outcome>" search archive schedule
    Examples:
      |Data     |Outcome |
      |2022-11  |success |
      |@$       |failed  |