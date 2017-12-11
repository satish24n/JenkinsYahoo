package com.yahoomail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yahoomail.base.ObjectRepository;

public class YahooLogin {
	
	WebDriver driver;
	
	public YahooLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.ID, using="login-username")
	WebElement emailIDinput;
	@FindBy(how= How.ID, using="login-signin")
	WebElement clickButton;
	@FindBy(how= How.ID, using="login-passwd")
	WebElement passwordInput;
	@FindBy(how= How.ID, using="login-signin")
	WebElement clickSignIn;
	
	//Methods
	public void LoginWithCred() {
		emailIDinput.sendKeys(ObjectRepository.userID);
		clickButton.click();
		passwordInput.sendKeys(ObjectRepository.userPassword);
		clickSignIn.click();
	}
	
}
