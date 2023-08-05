package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeastedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.manage().window().maximize();
				
				driver.get("https://www.leafground.com/frame.xhtml");

				
				//frame 1
				driver.switchTo().frame(2);
				
				//frame 2
				driver.switchTo().frame("frame2");
				
				driver.findElement(By.id("Click")).click();
				
			//	driver.switchTo().parentFrame();
				
				driver.switchTo().defaultContent();
	}

}
