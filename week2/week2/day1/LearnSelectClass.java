package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		
		//findelenment return type will webelement 
		//ctrl+2-l
		
		WebElement drop = driver.findElement(By.className("ui-selectonemenu"));
		
		//syntax for selectclass
		Select op=new Select(drop);
		
		//op.selectByVisibleText("Playwright");
		
		op.selectByIndex(4);
		
		
		
		
		
		
		
		
	}

}
