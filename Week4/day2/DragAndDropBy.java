package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement dbby = driver.findElement(By.id("form:conpnl_header"));
		
	Actions opt= new Actions(driver);
	
	opt.dragAndDropBy(dbby, 100, 0).perform();
	}

}
