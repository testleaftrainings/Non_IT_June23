package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{


	@DataProvider(name="setdata")
	public String[][] sendData() {
		String[][] data=new String[2][4];
		data[0][0]="TestLeaf";
		data[0][1]="Gokul";
		data[0][2]="S";
		data[0][3]="123456";
		
		
		data[1][0]="TestLeaf";
		data[1][1]="Vinoth";
		data[1][2]="S";
		data[1][3]="98765";
		
		return data;
	}
	
	@Test(dataProvider = "setdata")
	public  void runCreate(String cname,String fname,String lname,String ph) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		
	}
	
	
		
	

}
