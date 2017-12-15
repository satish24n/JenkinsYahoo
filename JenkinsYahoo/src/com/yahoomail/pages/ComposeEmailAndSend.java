package com.yahoomail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yahoomail.base.ObjectRepository;

public class ComposeEmailAndSend {
	WebDriver driver;
	
	public ComposeEmailAndSend(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//a[text()='Compose']")
	WebElement composeButton;
	@FindBy(how = How.XPATH, using="//input[@id='message-to-field']")
	WebElement receiver_ToField;
	@FindBy(how = How.XPATH, using="//input[@placeholder='Subject']")
	WebElement subject_email;
	@FindBy(how = How.XPATH, using="//div[@id='editor-container']/div[1]")
	WebElement emailBody_Editor;
	@FindBy(how=How.XPATH, using="//button[@title='Send this email']")
	WebElement send_Email_Button;
	
	@FindBy(how=How.ID, using="ybarAccountMenu")
	WebElement user_icon_topRight;
	
	@FindBy(how=How.XPATH, using="//span[text()='Sign out']")
	WebElement signOut_button;
	
	//Methods for Compose page
	
	public void composeAndSendEmail() {
		composeButton.click();
		receiver_ToField.sendKeys(ObjectRepository.email1);
		subject_email.sendKeys(ObjectRepository.subect_Text);
		emailBody_Editor.sendKeys(ObjectRepository.email_messageBody_Text);
		send_Email_Button.click();
	}
	public void signOut() {
		user_icon_topRight.click();
		signOut_button.click();
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	
}
