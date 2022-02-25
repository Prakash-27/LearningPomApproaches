package com.automationpractice.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.AuthenticationSignInPage;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {
	
	HomePage homePage;
	AuthenticationSignInPage authenticationSigninPage;
	MyAccountPage myAccountPage;
	
	
	public MyAccountPageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		authenticationSigninPage = new AuthenticationSignInPage();
		myAccountPage = new MyAccountPage();
		authenticationSigninPage = homePage.SigninButton();
		myAccountPage =	authenticationSigninPage.authenticationSignIn(prop.getProperty("email_address"), prop.getProperty("password"));
		
	}
	
	
	@Test
	public void GoToHomepage() {
		
		homePage = myAccountPage.MyAccountHomeButtonClK();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
