package com.inetbankingV1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pobjectslogin {
	WebDriver driver;
	
	public pobjectslogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="uid")
	WebElement TextUsername;
	
	@FindBy(name ="password")
	WebElement Textpassword;
	
	@FindBy(name ="btnLogin")
	WebElement btnlogin;
	
	public void setusername(String UserName) 
	{
		TextUsername.sendKeys(UserName);
	}
	
	public void setpassword(String PassWord) 
	{
		Textpassword.sendKeys(PassWord);
	}
	public void LoginButton() 
	{
		btnlogin.click();
	}
	
}
