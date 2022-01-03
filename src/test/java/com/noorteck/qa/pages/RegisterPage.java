package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement registerButton;

	@FindBy(xpath = "//a[text()='SIGN-ON']")
	WebElement signOnClick;
	
	@FindBy(xpath = "//*[@name='firstName']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//*[@name='lastName']")
	WebElement lastNameField;
	
	
	@FindBy(xpath = "//*[@name='phone']")
	WebElement phoneField;
	
	@FindBy(id = "userName")
	WebElement userNameField;
	
	@FindBy(name = "address1")
	WebElement addressField;
	
	@FindBy(name = "city")
	WebElement cityField;
	
	@FindBy(name = "state")
	WebElement stateField;
	
	@FindBy(name = "postalCode")
	WebElement postalCodeField;
	
	@FindBy(id = "countries")
	WebElement countryDropdown;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(name = "confirmPassword")
	WebElement confPassField;
	
	@FindBy(name = "submit")
	WebElement submitButton;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void registerB() {
		click(registerButton);
	}

	public void clickSignOn() {
		click(signOnClick);
	}

	public void enterfName(String name) {
		enter(firstNameField, name);
	}

	public void enterlName(String lName) {
		enter(lastNameField, lName);
	}

	public void enterPhoneNum(String phoneNum) {
		enter(phoneField, phoneNum);
	}

	public void enterUserName(String uName) {
		enter(userNameField, uName);
	}

	public void enteraddress(String address) {
		enter(addressField, address);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void enterState(String state) {
		enter(stateField, state);
	}

	public void enterPostalCode(String postal) {
		enter(postalCodeField, postal);
	}

	public void enterCountries(WebElement element, String methodName, String indexTextValue) {
		selectFromDropdown(countryDropdown, methodName, indexTextValue);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterPasswordConfir(String confirmPassword) {
		enter(confPassField, confirmPassword);
	}

	public void clickSubmmit(String submmit) {
		click(submitButton);
	}
}