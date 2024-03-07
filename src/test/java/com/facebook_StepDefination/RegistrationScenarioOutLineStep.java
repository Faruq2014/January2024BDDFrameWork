package com.facebook_StepDefination;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationScenarioOutLineStep extends BaseStep{
	
	RegistrationPage registrationPage;

	@Given("I open facebook application")
	public void iOpenFacebookApplication() {
		openApplication();
	}
	@When("I enter first name {string}")
	public void iEnterFirstName(String firstName) {
		registrationPage=new RegistrationPage(driver);
		 registrationPage.createNewAccount();
		 registrationPage.firstName(firstName);
	}
	@When("I enter last name {string}")
	public void iEnterLastName(String lastName) {
		registrationPage.lastName(lastName);
	}
	@When("I enter moble number {string}")
	public void iEnterMobleNumber(String mobile) {
		registrationPage.mobleNumber(mobile);
	}
	@When("I  re-enter email {string}")
	public void iReEnterEmail(String email) {
		registrationPage.reEnterEmail(email); 
	}
	@When("I enter new password {string}")
	public void iEnterNewPassword(String password) {
		registrationPage.newPassword(password);
	}
	@When("I enter birth month {string}")
	public void iEnterBirthMonth(String month) {
		registrationPage.birthMonth(month);
	}
	@When("I enter birth day {string}")
	public void iEnterBirthDay(String day) {
		registrationPage.birthDay(day);  
	}
	@When("I enter birth year {string}")
	public void iEnterBirthYear(String year) {
		registrationPage.birthYear(year);
	}
	@When("I select gender {string}")
	public void iSelectGender(String gender) {
		registrationPage.selectGender(gender);
	}
	@Then("I click registration button in step")
	public void iClickRegistrationButtonInStep() {
		closeApplication();
	}



}
