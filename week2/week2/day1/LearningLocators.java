package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningLocators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//webelement
		/*
		 * driver.findElement(By.id("username")).sendKeys("DemoSales");
		 * driver.findElement(By.id("username")).clear();
		 * driver.findElement(By.id("username")).sendKeys("DemoCsr");
		 */		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSales");
		Thread.sleep(3000);
		user.clear();
		Thread.sleep(3000);
		user.sendKeys("DemoCsr");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	//	driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
	}

}
