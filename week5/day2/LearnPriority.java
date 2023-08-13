package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	//priority not set=take in ascii & -ve value 
	//default=0
	@Test(priority=3)
	public void createLead() {
		System.out.println("Create");
	}
	
	@Test(priority=1)
	public void editLead() {
		System.out.println("Edit");
	}
	
	
	@Test
	public void deleteLead() {
		System.out.println("Delete");
	}
	

	@Test(priority=-3)
	public void dupLead() {
		System.out.println("Dup");
	}
	
}
