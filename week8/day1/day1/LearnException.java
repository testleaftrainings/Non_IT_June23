package week8.day1;

public class LearnException {

	public static void main(String[] args)   {

		int x=10;
		int y=0;
		
		//0-4
		int[] num= {2,6,2,79,5};
		
		try {
			System.out.println(num[6]);
			System.out.println(x/y);	
		}
		catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(num[4]);
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Done");
		}

	}

}
