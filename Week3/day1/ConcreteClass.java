package week3.day1;

public class ConcreteClass extends ICICIHQ {

	
	public void goldloan() {
		System.out.println("goldLoan");
		
	}

	@Override
	public void carLoan() {
		System.out.println("CarLoan");
		
		
	}
	
	public static void main(String[] args) {
	
		//create object for interface
		//for interface we cannot object
		//Rbi rbi= new Rbi();
		
		
		//abstract class
		//we cannot create object for abstract class
		//ICICIHQ ic= new ICICIHQ();
		
		
		//ConcreteClass
		ConcreteClass cc= new ConcreteClass();
		
		cc.carLoan();
		cc.goldloan();
		cc.kyc();
		System.out.println(cc.withdrwalsLimit());
		

	}

	

}
