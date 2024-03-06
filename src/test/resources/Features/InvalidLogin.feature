@invalidlogin
Feature: Invalid login feature for facebook

  @smoke
  Scenario: As a Tester I open facebook to validate my invalid login credetial
    so that only valid user can login

    Given I open facebook application url
    When I enter invalid userName
    And I enter invalid Password
    And click login button
    Then I assert my landing page
