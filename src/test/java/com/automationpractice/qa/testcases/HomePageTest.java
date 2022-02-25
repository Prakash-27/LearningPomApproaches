package com.automationpractice.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.AuthenticationSignInPage;
import com.automationpractice.qa.pages.HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest extends TestBase {

	HomePage homePage ;
	AuthenticationSignInPage authenticationSigninPage;


	public HomePageTest() {
		super();

	}


	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		authenticationSigninPage = new AuthenticationSignInPage();
	}


	@Test(priority = 1, description = "Verifying or Validating Home Page Title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verifying or Validating Home Page Title test on Home Page")
	@Story("Story Name: To Check Home Page Title")
	public void HomePageTitleTest() {
		String title = homePage.ValidateHomePageTitle();
		Assert.assertEquals(title,"My Store");
		System.out.println(title);
	}

	@Test(priority = 2, description = "Validating Home Page Automationpractice Logo Image test") 
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Validating Automationpractice Logo Image test on Home Page")
	@Story("Story Name: To Check Home Page Automationpractice Logo Image")
	public void automationpracticeLogoImageTest() {
		boolean flag = homePage.ValidateautomationpracticeLogo();
		Assert.assertTrue(flag);

	}

	@Test(priority = 3, description = "Verifying Home Page Sign in Button Click Test")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description: Verifying Sign in Button Click test on Home Page")
	@Story("Story Name: To Check Home Page Sign in Button Click")
	public void SignInbtnClickTest() {
		authenticationSigninPage = homePage.SigninButton();

	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}










}
