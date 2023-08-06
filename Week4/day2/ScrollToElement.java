package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");	
		
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Amazon Science']"));
		
		Actions opt=new Actions(driver);
		opt.scrollToElement(scroll).perform();
		scroll.click();
	
	
	}

}
