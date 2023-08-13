package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	//default={}-String
	//cde-ced
	
	@Test()
	public void createLead() {
		System.out.println("Create");
	}
	
	@Test()
	public void editLead() {
		System.out.println("Edit");
	}
	
	
	@Test(dependsOnMethods = {"createLead","editLead"})
	public void deleteLead() {
		System.out.println("Delete");
	}
}
