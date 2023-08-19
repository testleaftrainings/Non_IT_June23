package week6.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/table.xhtml");
	
		String firstData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println(firstData);
	
		//firstRow data to printed
		String rowData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[3]")).getText();
		System.out.println(rowData);
		//rowcount 
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
int rowsize = row.size();

System.out.println("row size : "+rowsize);

//colcount
List<WebElement> col = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));

int colsize = col.size();
System.out.println("Col size : "+colsize);

  //print all set ofdata inside webtale for-loop

for (int i = 1; i <=rowsize; i++) {
	
	for (int j = 1; j <=colsize; j++) {
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.println(text);
	}
}

	}

}
