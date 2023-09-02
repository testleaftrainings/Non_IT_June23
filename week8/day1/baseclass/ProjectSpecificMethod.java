package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utils.IntergrationWithTC;

public class ProjectSpecificMethod {

	//seq-static
	//it not suite for parallel-static
	
	//both seq and Parallel with help of constructor call in each pages
	public RemoteWebDriver driver;
	
	public String excelFile;
	
    public ExtentReports extent;
	public ExtentTest test ,node;
	public String testName,testDesc,testAuthor,testCategory;
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter repo =new ExtentHtmlReporter("./report/result.html");
		repo.setAppendExisting(true);
		extent =new ExtentReports();
		extent.attachReporter(repo);
		
		
		
	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	@BeforeClass
	public void testDetails() {
		 test=extent.createTest(testName, testDesc);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	
	
	public void reportstep(String message,String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			node.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			node.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}
	}
	
	
	public int takeSnap() throws IOException {
		int random = (int)(Math.random()*999999);
File scr = driver.getScreenshotAs(OutputType.FILE);
File dest=new File("./snap/img"+random+".png");
FileUtils.copyFile(scr, dest);

return random;
	}
	
//	0.465566*99999=   4265.908779(int)--4265
	
	@BeforeMethod
	public void preCondition() {
		
		 node = test.createNode(testName);
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod
	public void postCondition() {
	driver.close();
	}
	

	@DataProvider(name="setdata")
	public String[][] sendData() throws IOException {
		return IntergrationWithTC.readData(excelFile);
	
	}

}
