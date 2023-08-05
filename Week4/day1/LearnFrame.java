package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().window().maximize();
				
				driver.get("https://www.leafground.com/frame.xhtml");
				
				//focus to frame 
				driver.switchTo().frame(0);
				
			driver.findElement(By.xpath("//button[@id='Click']")).click();
			
			//come out from frame
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();

	}

}
