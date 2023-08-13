package week5.day2;

import org.testng.annotations.Test;

public class LearnEnabled {

	//default=true
	@Test()
	public void createLead() {
		System.out.println("Create");
	}
	
	@Test(enabled=false)
	public void editLead() {
		System.out.println("Edit");
	}
	
	
	@Test(priority=-1,enabled=false)
	public void deleteLead() {
		System.out.println("Delete");
	}
	

	@Test()
	public void dupLead() {
		System.out.println("Dup");
	}
	
}
