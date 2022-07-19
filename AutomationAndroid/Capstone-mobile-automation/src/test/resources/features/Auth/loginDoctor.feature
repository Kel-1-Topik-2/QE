@LoginDoctor
Feature: Login Doctor
  As a user
  I want to login
  So that I can access my dashboard doctor

  Scenario Outline: Login doctor scenario
    Given I am on the page login
    And I choose role doctor
    When I input field "<Username>" with field "<Password>"
    And click button login
    Then I get "<Result>"
    Examples:
      |Username |Password |Result           |
      |husain1234 |husain1234  |Success          |
      |         |password |Empty Username   |
      |username |         |Empty Password   |
      |         |         |Empty All        |
      |user13   |password |Invalid Username |
      |username |pass12   |Invalid Password |
      |user12   |pass12   |Invalid All      |