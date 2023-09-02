package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseclass.ProjectSpecificMethod;
import pages.LoginPage;
public class TC_001_Login extends ProjectSpecificMethod {
	
	@BeforeTest
	public void getdata() {
		
		excelFile="Login";
		testName="LeafTaps";
		testDesc="Login";
		testAuthor="Dilip";
		testCategory="Smoke";
	}
	
	
	
@Test(dataProvider ="setdata")
	public void Login(String username,String password) throws IOException {
		LoginPage lp= new LoginPage(driver,node);
		System.out.println(driver);
		lp.enterUserName(username).enterPassword(password).clickOnLogin()
		.clickOnCrm();
	
	}
}
