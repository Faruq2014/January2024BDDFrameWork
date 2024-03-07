@REGscenarioOutline
Feature: Registraion Scenario out line feature

  @smoke
  Scenario Outline: As a Testers open facebook to validate Registration credetials
    so that only valid user can login

    Given I open facebook application
    When I enter first name <firtName>
    And I enter last name <lastName>
    And I enter moble number <mobleNumber>
    #And I  re-enter email <reEnterEmail>
    And I enter new password <newPassword>
    And I enter birth month <birthMonth>
    And I enter birth day <birthDay>
    And I enter birth year <birthYear>
    And I select gender <selectGender>
    Then I click registration button in step

    Examples: 
      | firtName | lastName | mobleNumber | reEnterEmail | newPassword | birthMonth | birthDay | birthYear | selectGender |
      | "Faruq"  | "Molla"  | "fm@gmail"  | "fm@gmail"   | "k789"      | "Feb"      | "24"     | "2000"    | "male"       |
      | "Fabiha"  | "Molla"  | "fm@gmail"  | "fm@gmail"   | "k789"      | "Feb"      | "24"     | "2000"    | "male"       |
      | "Faiza"  | "Molla"  | "fm@gmail"  | "fm@gmail"   | "k789"      | "Feb"      | "24"     | "2000"    | "male"       |
      | "Faria"  | "Molla"  | "fm@gmail"  | "fm@gmail"   | "k789"      | "Feb"      | "24"     | "2000"    | "male"       |
