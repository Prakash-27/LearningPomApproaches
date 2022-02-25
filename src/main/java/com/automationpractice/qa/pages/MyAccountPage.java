package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class MyAccountPage extends TestBase {

	//Page Factory - Object Repository:
		@FindBy(xpath="//a[@title='Home']")
		WebElement clickonHomeBtn;
		
		
	//Initializing the Page Objects
		public MyAccountPage() {
			PageFactory.initElements(driver, this);
		}
			
		
	//Actions
		public HomePage MyAccountHomeButtonClK() {
			
			clickonHomeBtn.click();
			
			return new HomePage();
		}
	
	
	
	
	
	
	
	
}
