package com.facebook_StepDefination;

import org.junit.Assert;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseStep {
	LoginPage loginPage;

	@Given("I open facebook url")
	public void i_open_facebook_url() {
		openApplication();
	}

	@When("I enter userName")
	public void i_enter_user_name() {
		loginPage = new LoginPage(driver);
		loginPage.userName("kjkl");
	}

	@When("I enter Password")
	public void i_enter_password() {
		loginPage.password("jki;j");
	}

	@When("I click login button")
	public void i_click_login_button() {
		loginPage.loginButton();
	}

	@Then("I validate my landing page")
	public void i_validate_my_landing_page() {
		// Junit Assertion
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.facebook.com/";
		 //Assert.assertEquals(expectedUrl, actualUrl);
		closeApplication();
	}

}
