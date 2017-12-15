package com.yahoomail.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverCreationBase {
	
	public WebDriver driver;
	@BeforeMethod
	public void creatDriver() {
		File file = new File("C:/Selenium/geckodriver/geckodriver.exe");
		System.setProperty("webdriver.geckodriver.driver", file.getAbsolutePath());
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void terminatDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
