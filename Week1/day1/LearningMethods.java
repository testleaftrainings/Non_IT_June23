package week1.day1;

public class LearningMethods {

	public void name(){   
		System.out.println("Hi");
	}
	private int add(int a,int b) {
		return a+b;
		
	}
	//default
	void sub(int a) {
		System.out.println(a);
	}
	
	public void data(int age,String name) {
		System.out.println(age+""+name);
	}
	
	
	public static void main(String[] args) {
		
		//step1
		//classname objectname=new classname();
		LearningMethods lm=new LearningMethods();
		//step2 objectname.method();
		
		lm.name();
		
		//m1
		//if you  using returntype
		//ctrl+2-l
		int add = lm.add(10, 19);
		System.out.println(add);
		
		//m2
		System.out.println(lm.add(10, 19));
		
		
		lm.sub(5);
		lm.data(27, "Dilip");
		
	}
	
}
