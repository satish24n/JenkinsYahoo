package com.yahoomail.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.yahoomail.base.ObjectRepository;
import com.yahoomail.pages.ComposeEmailAndSend;
import com.yahoomail.pages.YahooLogin;

public class TC_001 {
	WebDriver driver;
	YahooLogin yl;
	
	@BeforeMethod
	public void beforeMetod() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ObjectRepository.URL);
	}
	@AfterMethod
	public void AfterMetod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void TC_001_loginUser() {
		YahooLogin yl = new YahooLogin(driver);
		yl.LoginWithCred();
	}
	
	@Test
	public void TC_002_ComposeAndSend() {
		YahooLogin yl = new YahooLogin(driver);
		yl.LoginWithCred();
		ComposeEmailAndSend ceas = new ComposeEmailAndSend(driver);
		ceas.composeAndSendEmail();
	}

}
