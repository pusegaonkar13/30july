package com.SauceDemo.PomPackage;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_Home_Page_Class 

	{
	//1. WebDriver declared
		 WebDriver driver;
		 private Select s;
		
	//2. Find WebElements
	//3. Element Action Perform

		// Element find of setting button 
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		WebElement settingbutton;
		
		public void clickedonsettingbtnmethod()
		{
			settingbutton.click();
		}
		
	// click on logout button	
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		 WebElement logoutbtn;
		
		public void clicklogoutbtnmethod()
		{
			logoutbtn.click();
			
		}
		
	// bagproduct 
		
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		 WebElement bagproduct;
		
		public void  clickbagproductmethod()
		{
			bagproduct.click();
		
		}
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		 WebElement clickedontrotrolleybtn;
		
		public void  clicktrolleymethod()
		{
			clickedontrotrolleybtn.click();
		
		}
	 		
		
	// Add to cart
		
		@FindBy(xpath="//span[@class='shopping_cart_badge']")
		 WebElement addToCartBtn;
		
		public String getTextFromAddToCartBtn()
		{
			String totalProductSelected = addToCartBtn.getText();
			return totalProductSelected;
			
		}
		
		@FindBy(xpath="//button[text()='Add to cart']")
		  List <WebElement> AllProduct;
		
		public void clickallproductmethod()
		{
			for(WebElement item:AllProduct)
			{
				item.click();
			}
			
		}
		
	// Filter Drop down 	
		@FindBy(xpath="//select[@class='product_sort_container']")
		 WebElement filterDropDown;
		
		public void clickonFilterDropmethod()
		{
			filterDropDown.click();
			s.selectByValue("Price (low to high)");
			
		}
	//4. constructor declare
		
		public POM_Home_Page_Class(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
			s = new Select(filterDropDown);
			
		}

}

