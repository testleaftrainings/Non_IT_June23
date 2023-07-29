package week3.day1;

public class ICICI implements Rbi{

	public int withdrwalsLimit() {
		// TODO Auto-generated method stub
		return 100000;
	}

	public void kyc() {
		System.out.println("pan card");
		
	}
	
	public void goldloan() {
		// TODO Auto-generated method stub
		
	}
	
	public int minlimit() {
		return 1000;
		
	}

	public static void main(String[] args) {
		ICICI ic= new ICICI();
		
	System.out.println(ic.withdrwalsLimit());
	
	ic.kyc();
	
	System.out.println(ic.minlimit());
	}

	
}
