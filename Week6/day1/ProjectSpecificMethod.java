package week6.day1;

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

public class ProjectSpecificMethod {

	public RemoteWebDriver driver;
	
	public String excelFile;
	
	@Parameters({"username","password","url","browser"})
	
	@BeforeMethod
	public void preCondition(String uname,String pword,String url,String browser) {
		
		//chrome.eq(chrome)
		if(browser.equalsIgnoreCase("chrome")) {
			driver  = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			 driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@AfterMethod
	public void postCondition() {
	driver.close();
	}

	
	@DataProvider(name="setdata",indices=1)
	public String[][] sendData() throws IOException {
		return IntergrationWithTC.readData(excelFile);
	
	}
	
}
