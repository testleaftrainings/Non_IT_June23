package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class IntegerSet {

	public static void main(String[] args) {
		int[] num= {1,4,6,5,8,2,6,2,4};
		
		Set<Integer> data= new TreeSet<Integer>();
		
		for (Integer i : num) {
			
			data.add(i);
		}
System.out.println(data);
	}

}
