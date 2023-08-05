package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicatechar {

	public static void main(String[] args) {
		
		String companyName="tetsleaf";
		//t,e
		
		char[] ch = companyName.toCharArray();
		
		//set -synax
		
		Set<Character> unique= new LinkedHashSet<Character>();
		
		//for each loop
		
		for (Character character : ch) {
			
			unique.add(character);
		}
		System.out.print(unique);

	}

}
