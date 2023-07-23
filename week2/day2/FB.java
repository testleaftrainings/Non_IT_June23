package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		//implicity wait 
//thread sleep-wait-will it wait till what time condition 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dilip");
		
		
		//title page  
		//gettitle return type -String
		
		String data="Facebook – log in or sign up";
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals(data)) {
			System.out.println("successful");
		}else {
			System.out.println("Not successful");
		}
		
		
		//get current url 
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//close
		driver.close();
		
		
		
	}
	
	

}
