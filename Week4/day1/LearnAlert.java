package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//syntax for  alert 
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		//simple alert
		//accept alert
		Thread.sleep(3000);
		alert.accept();
		
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		
		Thread.sleep(3000);
		
		//confirm alert
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		
		//handle other function-unhandle alert exception
		//driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		
		//confirm alert
		
		Thread.sleep(2000);
		alert.dismiss();
		
		
		String text3 = driver.findElement(By.id("result")).getText();
		System.out.println(text3);
		
		//no alert present excep
		//alert.accept();
		
		
	//	sweet alert-//span[text()='Dismiss']
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

		Thread.sleep(2000);
		driver.close();

	}

}
