package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		WebElement index1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement index3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement index5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		Actions opt=new Actions(driver);
		opt.keyDown(Keys.CONTROL).click(index1).click(index3).click(index5).keyUp(Keys.CONTROL).perform();
	
	}

}
