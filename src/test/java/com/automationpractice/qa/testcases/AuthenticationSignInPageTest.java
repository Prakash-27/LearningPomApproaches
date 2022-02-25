package com.automationpractice.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.AuthenticationSignInPage;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.MyAccountPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AuthenticationSignInPageTest extends TestBase {
	 
	HomePage homePage;
	AuthenticationSignInPage authenticationSigninPage;
	MyAccountPage myAccountPage;
	
	public AuthenticationSignInPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		authenticationSigninPage = new AuthenticationSignInPage();
		myAccountPage = new MyAccountPage();
		authenticationSigninPage = homePage.SigninButton();
	}
	
	
	@Test(priority = 1, description = " Verify Signin into Application with correct credentials ")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verifying Authentication Sign in Test on AuthenticationSignIn Page using correct credentials")
	@Story("Story Name: To Check AuthenticationSignIn Page Signin Functionality")
	public void VerifyAuthenticationSignIn() {
		
		myAccountPage =	authenticationSigninPage.authenticationSignIn(prop.getProperty("email_address"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
