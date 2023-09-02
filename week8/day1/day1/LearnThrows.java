package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnThrows {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		Thread.sleep(2000);
		
		FileInputStream file= new FileInputStream("./data/Login.xlsx");

	}

}
