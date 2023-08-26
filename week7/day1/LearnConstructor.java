package week7.day1;

public class LearnConstructor {

	int regNo=5;
	String stdName="Dilip";
	
	
	
	
	//default constructor or no args 
	
	public LearnConstructor() {
		System.out.println("Default Constructor");
		
		
	}
	
	public LearnConstructor(int regNo,String stdName) {
		this();
		
		System.out.println("parametrized constructor");
		System.out.println(this.regNo=regNo);
		System.out.println(this.stdName=stdName);
		
	}

	
	public LearnConstructor(int x) {
		this(123,"Deepak");
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		/*
		 * LearnConstructor lc = new LearnConstructor(); System.out.println(lc.regNo);
		 * System.out.println(lc.stdName);
		 * 
		 * 
		 * LearnConstructor lc1= new LearnConstructor(2023,"TestLeaf");
		 * System.out.println(lc.regNo); System.out.println(lc.stdName);
		 * 
		 * LearnConstructor lc2= new LearnConstructor(20,"Dinesh");
		 */
		
		LearnConstructor lc= new LearnConstructor(5);
		
		
	}
	
}
