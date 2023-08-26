package week7.day1;

public class LearnStatic {

	//varaiable
	 static String companyName; //static 
	String empName;  //non-static

	public void setData(String company,String name) {
		companyName=company;
		empName=name;
	}

	public void printData() {
		System.out.println(companyName +"  "+empName);
	}
	
	
	//static method
	
	public static void add(int x,int y) {
		System.out.println(x+y);
	}
	
	//static block
	
	static {
		System.out.println("I am static block");
	}

	public static void main(String[] args) {

		
		//if have static method -directly i call methodname
		
		add(5, 7);
		

		
		LearnStatic ls=new LearnStatic();
		ls.setData("TestLeaf", "GoKul");
		ls.printData();

		System.out.println("***************************");

		LearnStatic ls1=new LearnStatic();
		ls1.setData("HCL", "Vinoth");
		ls1.printData();
		ls.printData();
		
		System.out.println("***********************");
		LearnStatic ls2=new LearnStatic();

		ls2.setData("TestLeaf", "Ranjini");
		ls2.printData();
		ls1.printData();
		ls.printData();
	}
}
