package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import baseclass.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	//own constructor call and pass driver 
	//driver is my issue 
	
	public LoginPage(RemoteWebDriver driver,ExtentTest node) {
		
		this.driver=driver;
		this.node=node;
	}
	
	public LoginPage enterUserName(String uname) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(uname);
			reportstep("uesrname as enter sccussfully","pass");
		} catch (Exception e) {
			reportstep("uesrname as not enter sccussfully","fail");
		}

		
		return this;
	}
	
	
	
	public LoginPage enterPassword(String pass) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(pass);
			reportstep("password as enter sccussfully","pass");

		} catch (Exception e) {
			reportstep("password as not enter sccussfully","fail");

		}
		return this;
	}
	
	
	
	public HomePage clickOnLogin() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportstep("click on login sccussfully","pass");

		} catch (Exception e) {
			reportstep("login is not  sccussfully","fail");

		}
		
		return new HomePage(driver);
	}
}
