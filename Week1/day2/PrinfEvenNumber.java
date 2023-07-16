package week1.day2;

public class PrinfEvenNumber {

	public static void main(String[] args) {

		int num=25;
		//0,2,4,6,8,10,12,14,16,18,20,22,24
		//step 1-for loop
		//step 2-if condition
		//step 3-print even numbers
		
		for (int i = 0; i < num; i++) {
			//0%2=0
			//0==0
			if(i%2==0) {
				//7%2=1,1!=1-f
				//8%2=0,0!=1-t
				//if(i%2!=1)--type 2
				System.out.println("even numbers :"+i);
			}
		}
	}

}
