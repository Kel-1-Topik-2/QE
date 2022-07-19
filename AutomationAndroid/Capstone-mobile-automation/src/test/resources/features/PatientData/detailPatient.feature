@DetailPatient
Feature: Detail Patient
  As a Admin
  I want to See Detail Patient
  So that I can access Detail Patient Page

  Scenario: Detail Patient scenario
    Given I am on the logged Admin account
    When I click button information in data patient
    Then I get The detail patient page
