package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI {

	@FindBy(xpath="//a[text()='SIGN-ON']")
			WebElement signOnClick;
	@FindBy(xpath="//*[@name='userName']")
	WebElement userNameField;
	
	@FindBy(xpath="//[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitButton;
	
	public SignOnPage() {
	PageFactory.initElements(driver, this);
}
	public void clickSignOn() {
		click(signOnClick);
	}
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	public void submitB() {
		click(submitButton);
	}
}