package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

import io.qameta.allure.Step;

public class HomePage extends TestBase {
	
	//Page Factory - Object Repository:
	@FindBy(xpath="//a[@class ='login']")
	WebElement SignInbtn;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement AutomationPracticeLogo;

	
	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	@Step("Getting Home Page Title step....")
	public String ValidateHomePageTitle() {
		return driver.getTitle();
	}
	
	@Step("Verify AutomationPractice Logo is displayed step....")
	public boolean ValidateautomationpracticeLogo() {
		return AutomationPracticeLogo.isDisplayed();
	}
	
	@Step("Clicking Authentication Sign in button step....")
	public AuthenticationSignInPage SigninButton() {
		
		 SignInbtn.click(); 
		 
		return new AuthenticationSignInPage();
	}

	
}
