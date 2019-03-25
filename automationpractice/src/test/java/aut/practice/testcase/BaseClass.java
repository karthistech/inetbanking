package aut.practice.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import org.apache.log4j.*;

import aut.practice.utilities.configread;

public class BaseClass {
	
	public static configread config=new configread();
	public  static String BaseURL = config.BaseURLlinkpage();
	public  static String UserName=config.UserName();
	public  static String PassWord= config.PassWord();
	public  static String ChromePath=config.ChromePath();
	public  static String FirefoxPath= config.FirefoxPath();
	WebDriver driver;
	Logger logger;
	public static ExtentReports extent;
	@BeforeSuite
	public void beforesuite() {
		logger = Logger.getRootLogger();
		
		//ConsoleAppender CONSOLE = new ConsoleAppender();
		//logger.addAppender(CONSOLE);
		PropertyConfigurator.configure("./configuration/Log4j.properties");
		
		extent = new ExtentReports("extent.html");
	}
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ChromePath);
		driver = new ChromeDriver();
		
		
	}
	@AfterClass
	public void close() {
	//driver.close();
	//driver.quit();
	//extent.flush();
	}

}
