package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> mentors= new ArrayList<String>();
		//add()
		mentors.add("Aathi");
		mentors.add("Gokul");
		mentors.add("Mukesh");
		mentors.add("Muthu");
		mentors.add("Vinoth");
		mentors.add("Gokul");
		
		System.out.println(mentors);
		
		//add(1,"")
		mentors.add(2, "Dilip");
		mentors.add(4, "vinoth");
		System.out.println(mentors);
		
		//remove
		String remove = mentors.remove(4);
		System.out.println(remove);
		System.out.println(mentors);
		
		//contains
		boolean contains = mentors.contains("Aravind");
		System.out.println(contains);
		
		//
		mentors.add("Aathi");
		
		System.out.println(mentors);
		//get()
		
		String string = mentors.get(4);
		System.out.println(string);
		
		for (int i = 0; i < mentors.size(); i++) {
			
			System.out.println(mentors.get(i));
		}
		
		//clear
		
		mentors.clear();
		
		System.out.println(mentors);
	}

}
