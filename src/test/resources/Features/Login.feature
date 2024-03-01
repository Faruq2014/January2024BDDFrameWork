@login
Feature: login feature for facebook

  @smoke
  Scenario: As a Tester I open facebook to validate my login credetial
    so that only valid user can login

    Given I open facebook url
    When I enter userName
    And I enter Password
    And I click login button
    Then I validate my landing page
