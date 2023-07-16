package week1.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LearnOperators {

	public static void main(String[] args) {
		
		//1.Arithmetic operators
		System.out.println(5+6);
		System.out.println(10-6);
		System.out.println(5*6);
		System.out.println(6/2);
		System.out.println(7%2);

//2.Assignment operators:
	int	age=20;
	
	//3.3.Relational operators:
	System.out.println(5>6);
	System.out.println(5<6);
	System.out.println(5>=4);
	System.out.println(5!=6);

System.out.println("-------------------------------------");
//4.logical operators
	System.out.println((3<3)&&(5<6));
	System.out.println((3<3)||(5<6));
	
	//5.unary operators

	int i=1;
	System.out.println(i++);//1-post increment
	System.out.println(i);//2
	System.out.println(++i);//pre increment
	
	
	System.out.println(--i);//pre decrement
	System.out.println(i--);//2-post decrement
	System.out.println(i);//1
	}

}
