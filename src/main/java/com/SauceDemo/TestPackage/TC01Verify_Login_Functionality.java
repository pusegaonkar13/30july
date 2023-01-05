package com.SauceDemo.TestPackage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomPackage.POM_Login_Class;

public class TC01Verify_Login_Functionality extends TestBaseClass
{
	
	@Test
	public void VerifyLoginFunctionality() 
	{
	
		//---- Validation--//
		log.info("Apply the validation");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, givenTitle);
		
		}
}
