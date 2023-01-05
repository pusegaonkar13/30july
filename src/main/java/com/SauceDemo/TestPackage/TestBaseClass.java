package com.SauceDemo.TestPackage;

import java.io.IOException;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.PomPackage.POM_Login_Class;
import com.SauceDemo.UtilityPackage.Utility_Class;

//import project1.LoginPOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemo30thjulybatch");
	
	@Parameters("browserName")
	@BeforeMethod
	
	public void setup(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		log.info("verify Login Functionality test case");
		System.setProperty("webdriver.chrome.driver","./DriversFolder/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			
			System.setProperty("webdriver.gecko.driver", "./DriversFolder/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}	
			
			PropertyConfigurator.configure("log4j.properties");
			log.info("Browser is opened");
			
		
	
		
	//	System.out.println("Browser is opened"); delete all print system 
		
		driver.manage().window().maximize();
		
		log.info("Browser maximized");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		log.info("url opened");
		
		//Screen shot 
		Utility_Class.screenshotmethod(driver, "prince1");
		
		// Login POM class object		
		POM_Login_Class lp = new POM_Login_Class(driver);
		
		lp.username();
		log.info("User name entered");
		
		lp.password();
		log.info("Passwored Entered");
		
		lp.clcikloginbutton();
		log.info("Clicked on login Button");
		
		// --- Home page--- //
		log.info("Went on home page");
		
		// Screen shot 
		Utility_Class.screenshotmethod(driver, "pusegaonkar358");
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of the program");
	}
	
	
	

}
