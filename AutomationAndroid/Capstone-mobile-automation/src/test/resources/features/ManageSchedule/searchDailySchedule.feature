@SearchDailySchedule
Feature: Search Daily Schedule
  As a Admin
  I want to Search Daily Schedule
  So that I can Searching Daily Schedule

 Scenario Outline: Search Daily Schedule scenario
    Given I am on the Logged Level Account Admin
    When I searching "<Data>" in daily schedule data
    Then I get "<Outcome>" search daily schedule
    Examples:
      |Data     |Outcome |
      |patient  |success |
      |@$       |failed  |