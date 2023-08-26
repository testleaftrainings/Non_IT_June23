package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//syntax
		
		WebElement visi = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
		
		WebElement until = wait.until(ExpectedConditions.visibilityOf(visi));

	}

}
