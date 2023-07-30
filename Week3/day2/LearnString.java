package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		//syntax 1
		String name="TestLeaf";
		
		String name1="TestLeaf";
		//syntax 2
		String data= new String("TestLeaf");
		
		String data1= new String("Testleaf");
		
		//methods
		//1. length()-->variable.length()
		
		int length = name.length();
		System.out.println("total number of characters : "+length);
		
		//2. equals
		
		if(name.equals(data)) {
			System.out.println("equals() --Successful");
		}else {
			System.out.println("not Successful");
		}
		
		//== it will check memory address
		if(name==name1){
			System.out.println(" == -Successful");
		}else {
			System.out.println("not Successful");
		}
		
		//3. equalsignorecase
		
		if(name1.equalsIgnoreCase(data1)){
			System.out.println("equalsignorecase --Successful");
		}else {
			System.out.println("not Successful");
		}
		
		//4. contains  String name="TestLeaf";
		
		boolean contains = name.contains("Es");
		
		System.out.println("contains ->"+contains);
		
		//5. tocharArray   String name="TestLeaf";
		
		char[] ch = name.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.print(ch[i]);
			
		}
		
		//6 charAt(index) index start with '0'  String name="TestLeaf"
		System.out.println("");
		char charAt = name.charAt(6);
		System.out.println(charAt);
	}

}
