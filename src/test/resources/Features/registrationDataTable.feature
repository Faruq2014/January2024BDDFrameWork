@reg
Feature: Registration page

  @smoke
  Scenario: As a user I want to register so that only
    vaild user can use facebook

    Given I open facebook url open
    When I complete registraton form
      | firtName | lastName | mobleNumber | reEnterEmail | newPassword | birthMonth | birthDay | birthYear | selectGender |
      | Faruq    | Molla    | fm@gmail    | fm@gmail     | k789        | Feb        |       24 |      2000 | male         |
   
    Then validate outcome
