package week3.day1;

public class BMWC extends CarP{

	
	  public void sunRoof() {
		  System.out.println("Child class- sunroof"); 
		  }
	 
	  public void applyBreak() {
		  System.out.println("ABS break-BMW");
	  }
	
	  public void startApp() {
		  System.out.println("b");
	  }
	
	public static void main(String[] args) {
		BMWC b=new BMWC();
		b.applyBreak();
		b.horn();
		b.airBag();
		b.sunRoof();
		b.startApp();
		
	}
}
