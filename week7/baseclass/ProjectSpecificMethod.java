package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.IntergrationWithTC;



public class ProjectSpecificMethod {

	//seq-static
	//it not suite for parallel-static
	
	//both seq and Parallel with help of constructor call in each pages
	public RemoteWebDriver driver;
	
	public String excelFile;
	
	
	
	@BeforeMethod
	public void preCondition() {
		
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
