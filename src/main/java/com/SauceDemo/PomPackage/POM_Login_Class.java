package com.SauceDemo.PomPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Login_Class 
{
	//1. Web driver declared
		WebDriver driver;
		private Actions act;
		
	//2. find WebElements
			 // do not use find element- user name
			//WebElement user name =  driver.findelement(By.xpath("ABC"));
		
	// use annotation -->  @ --> @FindBy --> its like method only
		
		@FindBy(xpath="//input[@id='user-name']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(xpath="//input[@id='login-button']")
		WebElement loginbtn;
		
	//3. Element--> Action perform
		// maintain them in method
		
	public void username()			// non static method 	
	{
		username.sendKeys("standard_user");
	}
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	//public void clickedOnloginbutton()
	//{
//		loginbtn.click();
	//}

	// Mouse Action by clicking on login button
		public void clcikloginbutton()
		{
			act.click(loginbtn).perform();
		}
		

	//4. Constructor Declare

	public POM_Login_Class (WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver); 
	}

}
