@forgot
Feature: I want to use this background for my feature file

  Background: I want to run login scenario as background feature
    Given I open facebook app
    When I enter userName "hello"
    And I enter Password "Hi13" for the app
    And I click the login button
    Then I validate landing page with my name

  @smoke
  Scenario: As a tester I want to test forgot password account
    so that user can only login with valid login credetial

    When I click forgot password button
    Then find your account button showedup

  @smoke
  Scenario: As a tester I want to test forgot password account
    so that user can only login with valid login credetial

    When I click forgot password button
    Then find your account button showedup
