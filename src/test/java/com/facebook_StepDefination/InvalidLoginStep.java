package com.facebook_StepDefination;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLoginStep extends BaseStep {

	LoginPage loginPage;

	@Given("I open facebook application url")
	public void i_open_facebook_application_url() {
		openApplication();
	}

	@When("I enter invalid userName")
	public void i_enter_invalid_user_name() {
		loginPage = new LoginPage(driver);
		loginPage.userName("jjj");
	}

	@When("I enter invalid Password")
	public void i_enter_invalid_password() {
		loginPage.password("l;l");
	}

	@When("click login button")
	public void click_login_button() {
		loginPage.loginButton();
	}

	@Then("I assert my landing page")
	public void i_assert_my_landing_page() {
		closeApplication();
	}
}
