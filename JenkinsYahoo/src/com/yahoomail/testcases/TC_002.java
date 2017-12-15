package com.yahoomail.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.yahoomail.base.DriverCreationBase;

public class TC_002 extends DriverCreationBase{
	
	@Test
	public void testTwoExp() {
//		driver.get("https://outlook.live.com/owa/?authRedirect=true");
		
		driver.get("https://outlook.live.com/owa/?authRedirect=true");
		driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Email, phone, or Skype')]")).sendKeys("android24n@outlook.com");
		driver.findElement(By.id("idSIButton9")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Password')]")).sendKeys("X1carbon");
		driver.findElement(By.id("idSIButton9")).click();
		
		
	}

}
