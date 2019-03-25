package aut.practice.testcase;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport {
	
	    public static void main(String[] args) {
	        // start reporters
	        //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
	        // create ExtentReports and attach reporter(s)
	        ExtentReports extent = new ExtentReports("extent.html");
	       // extent.attachReporter(htmlReporter);

	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test = extent.startTest("MyFirstTest", "Sample description");

	        // log(Status, details)
	        test.log(LogStatus.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.log(LogStatus.INFO, "This step shows usage of log(status, details)");

	        // log with snapshot
	        test.log(LogStatus.INFO, "This step shows usage of log(status, details)");

	        // test with snapshot
	       // test.addScreenCaptureFromPath("screenshot.png");
	        
	        // calling flush writes everything to the log file
	        extent.flush();
	    }
	

}
