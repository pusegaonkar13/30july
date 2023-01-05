package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomPackage.POM_Home_Page_Class;

public class TC04Verify_AllProduct_AddToCart_Functionality extends TestBaseClass
{
	@Test
	public void addtocartallproductfunctionality() throws InterruptedException
	{
		POM_Home_Page_Class hp = new POM_Home_Page_Class(driver);
		hp.clickallproductmethod();
		log.info("All Product Selected");
		Thread.sleep(3000);	
		
		log.info("Apply The Validation");
		
		String expectedselectedproduct="6";
		String actualproductselected =hp.getTextFromAddToCartBtn();
		
		Assert.assertEquals(actualproductselected, expectedselectedproduct);
		
		
		
		
		
	}
	
	

}
