package aut.practice.testcase;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aut.practice.pageobj.loginpage_obj;

public class TC_001_Login extends BaseClass{

	
	@Test
	public void Login()
	{
			
	driver.get(BaseURL);
	ExtentTest test = extent.startTest("MyFirstTest", "Sample description");
	logger.info("This is main test class java");
	loginpage_obj lp = new loginpage_obj(driver);
	
	lp.btn_signin_click();
	test.log(LogStatus.INFO, "SignIn page clicked");
	lp.send_UserName(UserName);
	test.log(LogStatus.INFO, "Entered the User Name");
	lp.send_PassWord(PassWord);
	test.log(LogStatus.INFO, "Entered the Password");
	lp.btn_submit_click();
	test.log(LogStatus.PASS, "Submit button clicked");
	
	//extent.flush();
	}
}
