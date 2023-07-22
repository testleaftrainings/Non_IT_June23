package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		//step1 -launch browser
		ChromeDriver driver= new ChromeDriver();
		
		//step2-load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//maximized screen
		driver.manage().window().maximize();
		
		//wait-java-wait
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
	}

}
