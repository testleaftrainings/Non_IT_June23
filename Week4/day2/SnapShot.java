package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapShot {

	public static void main(String[] args) throws IOException {
		

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSales");
		
		//step to screen shot
		//driver or webelement .getScreenshotsAs()
		File scr = user.getScreenshotAs(OutputType.FILE);
		//store img
		File dest=new File("./snap/img1.png");
		
		FileUtils.copyFile(scr, dest);
		
	}
	
	

}
