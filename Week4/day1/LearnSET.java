package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSET {

	public static void main(String[] args) {
		
		
		
		//String[] name1= {"Gokul","Vinoth","aathi"};
		
		Set<String> mentor= new TreeSet<String>();

		
		  mentor.add("Gokul");
		  mentor.add("Vinoth"); 
		  mentor.add("aathi");
		  mentor.add("Mukesh"); 
		  mentor.add("Muthu"); 
		  mentor.add("Muthu");
		  mentor.add("Aathi");
		 

		System.out.println(mentor);
		
		/*
		 * for (String string : name1) {
		 * 
		 * mentor.add(string); }
		 */
		
		System.out.println(mentor);
		
		//for each - collection program
		
		//for(int i=0;i <mentor.size();i++)
		//int i-Integer i
		//String name : mentor
		
		for (String name : mentor) {
			System.out.println(name);
		
			
		}
		
		//convert set into list
		//if you want to get one info or data convert set into list

		List<String> data= new ArrayList<String>(mentor);
		System.out.println(data);
	
		String string = data.get(4);
		System.out.println(string);
	}

}
