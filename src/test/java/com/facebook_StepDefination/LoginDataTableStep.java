package com.facebook_StepDefination;

import java.util.List;
import java.util.Map;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataTableStep extends BaseStep{

	LoginPage loginPage;
	@Given("I enter facebook application url")
	public void iEnterFacebookApplicationUrl() {
		openApplication();
	}
	@When("I enter userName and password")
	public void iEnterUserNameAndPassword(DataTable dataTable) {
		loginPage = new LoginPage(driver);
		
		List<Map<String, String>> dataList=dataTable.asMaps();
		for (Map<String, String> map : dataList) {
			loginPage.userName(map.get("userName"));
			loginPage.password(map.get("Password"));
			
		}
	  
	}
	@When("I click on loginButton")
	public void iClickOnLoginButton() {
		loginPage.loginButton();
	}
	@Then("I verify my landing page")
	public void iVerifyMyLandingPage() {
		closeApplication();
	}




}
