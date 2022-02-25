package com.automationpractice.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.automationpractice.qa.util.TestUtil;
import com.automationpractice.qa.util.WebEventListener;

@SuppressWarnings("deprecation")
public class TestBase {

   public static WebDriver driver;
   public static Properties prop;
   @SuppressWarnings("deprecation")
   public  static EventFiringWebDriver e_driver;
   public static WebEventListener eventListener;
	
  public TestBase() {
	  
	  try {
		  prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Prakash\\eclipse-workspace\\PageObjectModelApproaches\\src\\"
				  + "main\\java\\com\\automationpractice\\qa\\config\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
	
  
	  @SuppressWarnings("deprecation")
	public static void initialization() {
		  
		 String browsername =  prop.getProperty("browser");
		 if(browsername.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\PageObjectModelApproaches\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 
		 else if(browsername.equals("FF")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prakash\\eclipse-workspace\\PageObjectModelApproaches\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		 }
		 
		 
		 
		 e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
		 
			
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout( TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("url"));
		 
		 
		 
//		 public String getScreenshot() {
//			 
//				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//				String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
//				File destination = new File(path);
//				try {
//					FileUtils.copyFile(src, destination);
//				} catch (IOException e) {
//					System.out.println("Capture Failed " + e.getMessage());
//				}
//				return;
//			}
		 
		 
		 
		 
		 
		 
		 
		 
	  }


	
			
		
	  
	  
	  
		
	
	
	
	
	
}
