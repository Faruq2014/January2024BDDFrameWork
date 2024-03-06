@scenarioOutline
Feature: login Scenario out line feature for facebook

  @smoke
  Scenario Outline: As a Testers open facebook to validate login credetials
    so that only valid user can login

    Given I want to open facebook application
    When I input for the <userName> in step
    And I enter the <password> in step
    Then I click login button in step

    Examples: 
      | userName | password |
      | "klk"    | "5;ll"   |
      | "mnmt"   | "45w"    |
      | "klk"    | "5;ll"   |
      | "mnmt"   | "45w"    |
