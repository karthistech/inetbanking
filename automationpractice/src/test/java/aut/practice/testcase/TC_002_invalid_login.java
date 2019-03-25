package aut.practice.testcase;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import aut.practice.pageobj.loginpage_obj;
import junit.framework.Assert;

public class TC_002_invalid_login extends BaseClass{
	
	
	@Test
	public void invalid_login() {
		ExtentTest test = extent.startTest("Invlid Login", "Login with invalid credential");
		driver.get(BaseURL);
		loginpage_obj logn_pObj = new loginpage_obj(driver);
		test.log(LogStatus.INFO, "Test Execution Started");
		
		logn_pObj.btn_signin_click();
		test.log(LogStatus.INFO, "Sign button clicked");
		logger.info("Sign-in button clicked");
		
		logn_pObj.send_UserName(UserName);
		logger.info("Entered the username");
		test.log(LogStatus.INFO, "Entered the UserName");
		
		
		logn_pObj.send_PassWord("password");
		logger.info("Entered the password");
		test.log(LogStatus.INFO, "Entered the Password");
		logn_pObj.btn_submit_click();
		
		//if (Assert.assertEquals(expected, actual);
	}

}
