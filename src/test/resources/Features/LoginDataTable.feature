@loginDataTable
Feature: login data table feature for facebook

  @smoke
  Scenario: As a Tester I open facebook to validate my login credetial
    so that only valid user can login using login data table

    Given I enter facebook application url
    When I enter userName and password
      | userName | Password |
      | kll      | jlk12    |
    And I click on loginButton
    Then I verify my landing page
