package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{

	public void leads() {
		driver.findElement(By.linkText("Leads")).click();

	}
}
