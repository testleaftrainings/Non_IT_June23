package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.ProjectSpecificMethod;
import pages.LoginPage;
public class TC_001_Login extends ProjectSpecificMethod {
	
	@BeforeTest
	public void getdata() {
		
		excelFile="Login";
	}
	
	
	
@Test(dataProvider ="setdata")
	public void Login(String username,String password) {
		LoginPage lp= new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName(username).enterPassword(password).clickOnLogin()
		.clickOnCrm();
	
	}
}
