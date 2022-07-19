@AddDoctor
Feature: Add Doctor
  As a Admin
  I want to Add List Doctor
  So that I can access Add Doctor Page

  Scenario Outline: Add Doctor scenario
    Given I am logged account admin
    And I click add data in data doctor
    When I input field "<fullName>" with field "<npaIdi>" and field "<spesialis>"
    And I input field "<username>" and field "<password>" and field "<confirmpass>"
    And click save doctor button
    Then I get the "<output>" add doctor
    Examples:
      |fullName     |npaIdi   |spesialis    |username |password |confirmpass |output          |
      |             |346431   |pediatrician |doctor01 |docPass2 |docPass2    |Empty fullName  |
      |Hakim Ahmad  |         |dentist      |doctor01 |docPass2 |docPass2    |Empty npaIdi    |
      |Hakim Ahmad  |422224   |             |doctor01 |docPass2 |docPass2    |Empty spesialis |
      |Hakim Ahmad  |424352   |pediatrician |         |docPass2 |docPass2    |Empty username  |
      |Hakim Ahmad  |122352   |dentist      |doctor01 |         |            |Empty password  |
      |             |         |             |         |         |            |Empty all       |
      |Hakim Ahmad  |IdiNpa Is|pediatrician |doctor01 |docPass2 |docPass1    |Invalid npaIdi  |
      |Hakim Ahmad  |533311   |dentist      |doctor   |docPass2 |docPass1    |Limit username  |
      |Hakim Ahmad  |235325   |pediatrician |doctor01 |docPas   |docPas      |Limit password  |
      |Hakim Ahmad  |252323   |dentist      |doctor01 |docPass2 |docPass1    |not SamePass    |
      |newName      |newNpa   |dentist      |newUser  |docPass1 |docPass1    |Success         |