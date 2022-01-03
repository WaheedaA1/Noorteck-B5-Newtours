package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;

public class ObjInitialize extends Constants {
	
	 
	
	public void initializeClassObj() {
		//initialize each page class objects here..
		  homePObj= new HomePage();
		  signOnPObj = new SignOnPage();
		  registerPObj = new RegisterPage();
		  flightsPObj = new FlightsPage();
	}

}
