package com.facebook_StepDefination;

import java.util.List;
import java.util.Map;

import com.facebook_BaseSteps.BaseStep;
import com.facebook_Pages.RegistrationPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep extends BaseStep{
	
	RegistrationPage registrationPage;
	@Given("I open facebook url open")
	public void iOpenFacebookUrlOpen() {
		openApplication(); 
	}
	@When("I complete registraton form")
	public void iCompleteRegistratonForm(DataTable regTable) {
		registrationPage=new RegistrationPage(driver);
		List<Map<String, String>> regTableList=regTable.asMaps(String.class, String.class);
    for(Map<String, String> map:regTableList) {
    	System.out.println(map.get("firtName"));
    	 registrationPage.createNewAccount();
    	 registrationPage.firstName(map.get("firtName"));
		 registrationPage.lastName(map.get("lastName"));
		 registrationPage.mobleNumber(map.get("mobleNumber"));
		 //registrationPage.reEnterEmail(map.get("reEnterEmail"));
		 registrationPage.newPassword(map.get("newPassword"));
		 registrationPage.birthMonth(map.get("birthMonth"));
		 registrationPage.birthDay(map.get("birthDay"));
		 registrationPage.birthYear(map.get("birthYear"));
		 registrationPage.selectGender(map.get("selectGender"));

}
		

	}
	@Then("validate outcome")
	public void validateOutcome() {
		closeApplication();   
	}




}
