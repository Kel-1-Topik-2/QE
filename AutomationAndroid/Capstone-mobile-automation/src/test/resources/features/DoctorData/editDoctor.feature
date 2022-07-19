@EditDoctor
Feature: Edit Doctor
  As a Admin
  I want to Edit Detail Doctor
  So that I can access Edit Doctor Page

  Scenario Outline: Edit Doctor scenario
    Given I am logged Account admin
    And I click edit data in data doctor
    When I input Field "<FullName>" with field "<NpaIdi>" and field "<Spesialis>"
    And I input Field "<Username>" and "<Password>" and field "<ConfirmPass>"
    And click button save doctor
    Then I get the "<Output>" edit doctor
    Examples:
      |FullName     |NpaIdi   |Spesialis    |Username |Password |ConfirmPass |Output          |
      |             |342521   |pediatrician |doctor10 |docEdit2 |docEdit2    |Empty fullName  |
      |Ahmad        |         |dentist      |doctor10 |docEdit2 |docEdit2    |Empty npaIdi    |
      |Ahmad        |422424   |             |doctor10 |docEdit2 |docEdit2    |Empty spesialis |
      |Ahmad        |414121   |pediatrician |         |docEdit2 |docEdit2    |Empty username  |
      |Ahmad        |123523   |dentist      |doctor10 |         |            |Empty password  |
      |             |         |             |         |         |            |Empty all       |
      |Ahmad        |IdiNpa Is|pediatrician |doctor10 |docEdit2 |docEdit1    |Invalid npaIdi  |
      |Ahmad        |532421   |dentist      |doctor   |docEdit2 |docEdit1    |Limit username  |
      |Ahmad        |232425   |pediatrician |doctor10 |docEdit  |docEdit     |Limit password  |
      |Ahmad        |252443   |dentist      |doctor10 |docEdit2 |docEdit1    |not SamePass    |
      |newName      |newNpa   |dentist      |newUser  |docEdit1 |docEdit1    |Success         |
