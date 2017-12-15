package com.yahoomail.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverCreationBase {
	
	public WebDriver driver;
	@BeforeMethod
	public void creatDriver() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void terminatDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
