package com.facebook_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")  private WebElement uName;
	@FindBy(name="pass") protected WebElement pWord;
	@FindBy(xpath="//button[starts-with (@id,'u_0_5')]") public WebElement lButton;
	
	public WebElement userName(String enterUserName) {
		uName.sendKeys(enterUserName);
		return uName;
	}
	
	public WebElement userNameOne(String enterUserName) {
		uName.sendKeys(enterUserName);
		return uName;
	}
 
 
 public WebElement password(String enterPassword) {
	 pWord.sendKeys(enterPassword);
	return pWord;
	  }
 
 
 
 public void loginButton() {
	 lButton.click(); 
 }
 


}
