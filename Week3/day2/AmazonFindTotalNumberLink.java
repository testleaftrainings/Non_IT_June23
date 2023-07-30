package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFindTotalNumberLink {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.amazon.in/");
		
		//find more than one element so using
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number links is present : "+links.size());
		
		
		//print all the data in console
		for (int i = 0; i < links.size(); i++) {
			
			String text = links.get(i).getText();
			System.out.println(text);
		}
		
		//to click particular links in the webpage
		Thread.sleep(3000);
		links.get(4).click();
	}
}
