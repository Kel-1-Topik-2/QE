@ReviewOrdinaryCare
Feature: Review Ordinary Care
  As a Doctor
  I want to Review Care Patient
  So that I can access Review Ordinary Care Patient

  Scenario Outline: Review Ordinary Care scenario
    Given I am the Logged Level Doctor account
    When I click button process review
    And I input field "<diagnose>" and "<note>" review ordinary care
    Then I get message success review ordinary care
    Examples:
      |diagnose |note    |
      |Diabetes |newNote |