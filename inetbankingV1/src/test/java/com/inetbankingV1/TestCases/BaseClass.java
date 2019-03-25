package com.inetbankingV1.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbankingV1.utilities.ReadConfig1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	
	ReadConfig1 read= new ReadConfig1();
	public String BaseURL = read.BaseURL() ; 
	public String UserName = read.UserName();
	public String PassWord = (String)read.PassWord();
	public WebDriver driver;
	public   Logger logger;
	

	@BeforeClass
	public void setup () throws FileNotFoundException
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", read.chromepath());
		driver = new ChromeDriver(); 
       
       //logger = Logger.getLogger(BaseClass.class);
       logger = Logger.getRootLogger();
      // File file = new File("./Configuration/log4j.properties");
       //FileInputStream fis = new FileInputStream(file);
       PropertyConfigurator.configure("src//main//log4j.properties");
        //BasicConfigurator.configure();
        logger.info("Inside the setup of base class");
	}
	
	@AfterClass
	public void closure() {
		driver.quit();
		
	}
			
}