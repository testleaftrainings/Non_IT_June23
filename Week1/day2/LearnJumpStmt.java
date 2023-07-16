package week1.day2;

import java.util.Iterator;

public class LearnJumpStmt {

	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			System.out.println(i);
			if(i==7) {
				System.out.println("using break :"+i);
				break;
			}
		}
			System.out.println("**********************");
			
			
		for (int j = 0; j <10; j++) {
			System.out.println(j);
			if(j==5) {
				System.out.println("add");
				continue;
			}
			
		}
		
	}

}
