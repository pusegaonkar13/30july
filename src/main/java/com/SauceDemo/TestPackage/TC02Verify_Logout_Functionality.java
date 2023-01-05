package com.SauceDemo.TestPackage;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.SauceDemo.PomPackage.POM_Home_Page_Class;

public class TC02Verify_Logout_Functionality extends TestBaseClass
{
	@Test
	public void VerifyLogOutFunctionality()
	{
		POM_Home_Page_Class hp = new POM_Home_Page_Class(driver);
		
		hp.clickedonsettingbtnmethod();
		log.info("Clicked on setting button");
		
		hp.clicklogoutbtnmethod();
		log.info("Clicked on logout button");
		
		log.info("Went on Login Page");
		
	// apply validation
		log.info("Apply the validation");
		
		String giventitle ="Swag Labs";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, giventitle);
		
		}
	
}	
	


