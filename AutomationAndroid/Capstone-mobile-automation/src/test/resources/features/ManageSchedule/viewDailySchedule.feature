@ViewDailySchedule
Feature: View Daily Schedule
  As a Admin
  I want to View List Daily Schedule
  So that I can access List Daily Schedule

  Scenario: View Daily schedule scenario
    Given I am the Logged level Admin account
    When I click button manage schedule
    Then I get view list daily schedule