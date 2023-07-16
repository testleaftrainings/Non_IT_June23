package week1.day2;

import java.util.Arrays;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		
		int[] marks= {34,56,31,67,45,56,32,67,89,95,70};
		
		//mark[0]=34.mark[56]
		for (int i = 0; i < marks.length; i++) {
			
			//marks[31]
			for (int j = i+1; j < marks.length; j++) {
				
				if(marks[i]==marks[j]) {
					System.out.println("duplicate values :" +marks[i]);
				}
			}
			
		}
		System.out.println("*******************");
		
		int[] mark= {34,56,31,67,45,56,32,67,89,95,70};
		//{31,32,34,45,56,56,67,67,70,89,96}
		
		Arrays.sort(mark);
		
		for (int i = 0; i < mark.length-1; i++) {
			if(mark[i]==mark[i+1]) {
				System.out.println(mark[i+1]);
		}
		
		}
	}

}
