package com.facebook_StepDefination;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.LoginBackgroundPage;
import com.facebook_Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginBackgroundStep extends BaseStep {
	LoginBackgroundPage loginBackgroundPage;
	LoginPage loginPage;

	@Given("I open facebook app")
	public void iOpenFacebookApp() {
		openApplication();
	}

	@When("I enter userName {string}")
	public void iEnterUserName(String userName) {
		loginPage = new LoginPage(driver);
		loginPage.userName(userName);
	}

	@When("I enter Password {string} for the app")
	public void iEnterPasswordForTheApp(String password) {
		loginPage.password(password);
	}

	

	@When("I click the login button")
	public void iClickTheLoginButton() {
		loginPage.loginButton();
	}

	@Then("I validate landing page with my name")
	public void iValidateLandingPageWithMyName() {
		System.out.println("hello");
	}

	@When("I click forgot password button")
	public void i_click_forgot_password_button() {
		loginBackgroundPage = new LoginBackgroundPage(driver);
		loginBackgroundPage.forgotPassword();
	}

	@Then("find your account button showedup")
	public void find_your_account_button_showedup() {
		closeApplication();
	}

}
