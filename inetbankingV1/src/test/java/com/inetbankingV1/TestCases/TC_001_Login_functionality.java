package com.inetbankingV1.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import com.inetbankingV1.PageObjects.pobjectslogin;

public class TC_001_Login_functionality extends BaseClass{
	
	
	@Test
	public void successullogin() throws InterruptedException {
		
		driver.get(BaseURL);
		logger.info("Browser Opened"+ driver.getTitle());
		logger.debug("Test");
		Thread.sleep(5000);
		pobjectslogin login = new pobjectslogin(driver);
		
		login.setusername(UserName);
		logger.info("UserName Entered"+ driver.getTitle());
		System.out.println(PassWord);
		login.setpassword(PassWord);
		logger.info("Password Entered"+ driver.getTitle());
		Thread.sleep(2000);
		login.LoginButton();
		logger.info("Login button clicked");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Successful"+ driver.getTitle());
		} else
		{
			Assert.assertTrue(false);
			logger.info("Login Failed"+ driver.getTitle());
		}
		
	}

}
