package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//current window id
		String parent = driver.getWindowHandle();
		System.out.println("current window : "+parent);
	
		//multiple window handle
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(" multiple windows : "+windowHandles);
		
		for (String window : windowHandles) {
			System.out.println(window);
			
		}
		
		String parentname = driver.getTitle();
		System.out.println(parentname);
	
		//how pass my control child window
		//convert set in list
		
		List<String> allLinks=new ArrayList<String>(windowHandles);
		
		//syntax
		driver.switchTo().window(allLinks.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		
		//control will in child parent ,i need back parent window
		
		Thread.sleep(3000);
		driver.close();
		
		//switching to parent window
		driver.switchTo().window(allLinks.get(0));
		
		//next data i need check
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		
		List<String> parent2= new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(parent2.get(2));
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-check']")).click();
		//driver.quit();
	}

}
