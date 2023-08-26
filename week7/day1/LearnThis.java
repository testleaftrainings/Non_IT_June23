package week7.day1;

public class LearnThis {

	String data;
	
	
	
	public void readData(String data) {
		
		this.data=data;
		
		System.out.println(data);
		
	}
	
	
	public static void main(String[] args) {
		LearnThis lthis=new LearnThis();
		lthis.readData("TestLeaf");
		System.out.println(lthis.data);
		
		LearnThis lthis1=new LearnThis();
		lthis1.readData("TL");
		System.out.println(lthis1.data);
	}

}
