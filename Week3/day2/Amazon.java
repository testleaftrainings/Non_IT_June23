package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
         ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		
		List<WebElement> mprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int size = mprice.size();
		System.out.println(size);
		
		//create empty list
		List<Integer> numprice= new ArrayList<Integer>();
		
		
		for (int i = 0; i < size; i++) {
			String text = mprice.get(i).getText();
			//System.out.println(text);
			//data will be like this ---24,568
			
			//remove 20,564-20564
			String replace = text.replace(",", "");	
			System.out.println(replace);
			
			//do not allow white space before converting String to integer
			if(!replace.isEmpty()) {
			int parseInt = Integer.parseInt(replace);
			numprice.add(parseInt);
			}
		}
		
		//min price
		Collections.sort(numprice);
		
		Integer min = Collections.min(numprice);
		System.out.println(min);
	}

}
