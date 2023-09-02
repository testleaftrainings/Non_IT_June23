package week8.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTryCatch {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		try {
			driver.findElement(By.xpath("//input[@id='usernam']")).sendKeys("Demo");
		
		} catch (Exception e) {
			System.out.println(e);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		}

		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();


	}

}
