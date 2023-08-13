package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CreateLeadAtt {
	

	/*
	 * @Parameters({"username","password","url","browser"})
	 * 
	 * 
	 * @BeforeMethod public void pre(){ ChromeDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 * driver.findElement(By.id("password")).sendKeys("crmsfa");
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * }
	 */
	  
	
	//invocationCount default value=1
	//threadPoolSize default value=0

//	@Test(invocationCount=2,threadPoolSize=2)
	
	//@Test(timeOut=5000)
	
	@Test
	public  void runCreate() {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		driver.close();


	}

}
