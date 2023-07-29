package week3.day1;

public class LearnMethodOverloading {

	public void add() {
		int a=5;
		int b=8;
		System.out.println(a+b);
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int b,int a,int c) {
		System.out.println(a+b+c);
	}
	
	public int add(int a) {
		return a;
	}
	
	public void mul(double a,double b) {
		System.out.println(a*b);
	}

	public void data(int age,String name) {
		System.out.println(age +" "+ name);
	}
	
	public void data(String name,int age) {
		System.out.println(name +" "+ age);
	}
	
	public static void main(String[] args) {
		//substring(int)
		//substring(int,int)
				
		
		LearnMethodOverloading mol=new LearnMethodOverloading();
		
		mol.add();
		//int -datatype
		System.out.println(mol.add(6)); 
		mol.add(5, 7);
		mol.add(3, 6, 7);
		mol.data(20, "Dilip");
		mol.data("Kumar", 34);
		
		mol.mul(3.45, 4.56);
	}
}
