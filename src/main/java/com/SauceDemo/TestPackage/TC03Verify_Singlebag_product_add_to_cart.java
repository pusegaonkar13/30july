package com.SauceDemo.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemo.PomPackage.POM_Home_Page_Class;



public class TC03Verify_Singlebag_product_add_to_cart extends TestBaseClass
{
	
	@Test
	
	public void Verify_bag_product_add_to_cart()
	{
	
		
	// home page
		log.info("Went to home page");
	
	POM_Home_Page_Class hp = new POM_Home_Page_Class(driver);
	hp.clickbagproductmethod();
	log.info("clicked on bag product");
	
	
	
	// Apply Validation
	log.info("Apply validation");
	String expectedProductSelection ="1";		
	String actualProductSelected = hp.getTextFromAddToCartBtn();
	
	log.info("Apply The Validation");
	
	Assert.assertEquals(actualProductSelected, expectedProductSelection);
	log.info("Single Product selected");
	
	
	
	
}	
	
	

}
