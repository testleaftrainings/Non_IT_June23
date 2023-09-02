package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

	
	public HomePage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
	public MyHomePage clickOnCrm() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage();
	}
	
	
	public LoginPage Logout() {
		driver.findElement(By.className("decorativeSubmit")).click();
return new LoginPage(driver);
	}
}
