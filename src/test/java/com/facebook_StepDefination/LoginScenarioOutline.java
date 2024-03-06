package com.facebook_StepDefination;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioOutline extends BaseStep{
	
	LoginPage loginPage;
	
	@Given("I want to open facebook application")
	public void iWantToOpenFacebookApplication() {
		openApplication();
	}
	@When("I input for the {string} in step")
	public void iInputForTheInStep(String userName) {
		loginPage = new LoginPage(driver);
		loginPage.userName(userName);  
	}
	@When("I enter the {string} in step")
	public void iEnterTheInStep(String password) {
		loginPage.password(password); 
	}
	@Then("I click login button in step")
	public void iClickLoginButtonInStep() {
		loginPage.loginButton();
		closeApplication(); 
	}




}
