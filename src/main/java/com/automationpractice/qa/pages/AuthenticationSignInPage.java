package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

import io.qameta.allure.Step;

public class AuthenticationSignInPage extends TestBase {
	
	
	//Page Factory - Object Repository:
		@FindBy(name="email")
		WebElement email_address;
		
		@FindBy(name="passwd")
		WebElement password;
		
		@FindBy(name="SubmitLogin")
		WebElement AuthenpageSigninBtn;
		
		
		//Initializing the Page Objects
		public AuthenticationSignInPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		//Action
		@Step("Sign in with EmailID: {0} and Password: {1} step....")
		public MyAccountPage authenticationSignIn(String EmailId, String Pwd) {
			email_address.sendKeys(EmailId);
			password.sendKeys(Pwd);
			AuthenpageSigninBtn.click();
			
		    return new MyAccountPage();
		}
	
	
	
	
	
	
	
	

}
