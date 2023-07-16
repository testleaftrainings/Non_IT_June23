package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//method-1
		int[] num= {3,8,9,4,6,10,12,54,76,2,67};

		String[] mentors= {"gokul","vinoth","mukesh","Aathimuthu","muthu"};
		//method-2
		
		
		//find length-array length-property
		//ctrl+2-l
		int length = num.length;
		System.out.println(length);
		
		//print first data
		System.out.println("my first data :"+num[0]);
		
		//print last data
		//11-1=10-num[10]
		System.out.println("my last data : "+num[length-1]);
		
		
		//sort array
		Arrays.sort(num);
		
		System.out.println("after sortting array :"+num[0]);
		
		
		//for(int i=length;i>0;i--)
		
		//for(int i=length-1;i>=0;i--)
		
		
		for (int i = 0; i <=length-1; i++) {
			
			System.out.println(num[i]);
		}
		
		
		
		
		
		
	}

}
