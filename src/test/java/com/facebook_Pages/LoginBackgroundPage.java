package com.facebook_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBackgroundPage {
	WebDriver driver;


	

	public LoginBackgroundPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement forgotPass;

	public void forgotPassword() {
		forgotPass.click();
		

	}
}
