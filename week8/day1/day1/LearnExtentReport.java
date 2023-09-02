package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		/* Step1 -setup physical report path(ExtentHtmlReporter)
		 * step2- create object for extent reports(ExtentReports)
		 * step3- attach data with physical file(add step1 & step2)		 * 
		 * step4- create a testcase and assign test details
		 * step5- step level status
		 * step6- close report(flush) 
		 * */

		ExtentHtmlReporter repo =new ExtentHtmlReporter("./report/result.html");
		//to get older report in my result.html
		repo.setAppendExisting(true);
		
		// * step2- create object for extent reports(ExtentReports)
		ExtentReports extent=new ExtentReports();

		// * step3- attach data with physical file(add step1 & step2)		 * 
		extent.attachReporter(repo);

		// * step4- create a testcase and assign test details
		ExtentTest test=extent.createTest("LeafTaps", "createLead with companyname");
		test.assignAuthor("Dilip");
		test.assignCategory("smoke");
		
	
		ExtentTest test1=extent.createTest("LeafTaps", "EditLead");
		test1.assignAuthor("Dilip-1");
		test1.assignCategory("smoke-1");
		
		//* step5- step level status
	test.pass("username", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img.png").build());
		test.pass("enterpassword",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img1.png").build());
		test.pass("login");
		
		test1.pass("login");
		
		//step -close
		extent.flush();
		System.out.println("done");
	}

}
