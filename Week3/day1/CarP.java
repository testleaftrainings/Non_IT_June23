package week3.day1;

public class CarP extends VehicleGP{

	
	public void airBag() {
		System.out.println("parent class-airbag");
	}
	
	
	//single level
	
	public static void main(String[] args) {
		
		CarP c= new CarP();
		c.applyBreak();
		c.horn();
		c.airBag();
	}
}
