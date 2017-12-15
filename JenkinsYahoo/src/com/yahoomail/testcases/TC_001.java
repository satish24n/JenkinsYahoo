package com.yahoomail.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
	
/*	@Test
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
		String str1 = ceas.getTitle();
		ceas.signOut();
		String str2 = ceas.getTitle();
		System.out.println("$$$$: "+str1);
		System.out.println("####: "+str2);
		boolean flag=true;
		if(str2.equals(str1)) {
			flag=false;
		}
		Assert.assertTrue(flag);
	}*/
	
	@Test
	public void TC_003_assrt() {
		YahooLogin yl = new YahooLogin(driver);
		ComposeEmailAndSend ceas = new ComposeEmailAndSend(driver);
		yl.LoginWithCred();
		String str1 = ceas.getTitle();
		ceas.signOut();
		String str2 = ceas.getTitle();
		System.out.println("$$$$: "+str1);
		System.out.println("####: "+str2);
		boolean flag=true;
		if(str2.equals(str1)) {
			flag=false;
		}
		Assert.assertTrue(flag);
	}

}
