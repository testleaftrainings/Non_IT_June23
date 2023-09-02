package week8.day1;

public class LearnThrow {

	public static void main(String[] args) throws NoSuchMethodException {
		
		//Throw-userdefine one

		int x=10;
		
		if(x<0) {
			System.out.println("NO");
		}else {
			throw new NoSuchMethodException("The number 10 ,is not less than '0'");
		}
	}

}
