package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		
		String product="product price 2500";
		//2500 price product
		//split
		String[] split = product.split(" ");
		
		//p[0]
		//roduct[1]
		//p[2]
		//rice[3]
		//2500[4]
		
		//roduct-[0]
		//price-[1]
		//2500[2]
		System.out.println(split[1]);
		
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.print(split[i]);
		}
		
		System.out.println(" ");
		
		for (int i =split.length-1 ; i >=0 ; i--) {
			System.out.print(split[i]);
		}
		
		System.out.println(" ");
		//replace-one char
		String letter="TestLeaf 2023";
		String replace = letter.replace('e', '@');
		System.out.println(replace);
		
		//replaceAll
		
		String replaceAll = letter.replaceAll("[^0-9]", " ");
		System.out.println(replaceAll);
		
		String replaceAll2 = letter.replaceAll("[!a-zA-z]", " ");
		System.out.println(replaceAll2);
		
		//substring
		
		String data="Dilip";
		String substring = data.substring(3);
		System.out.println(substring);
		
		//1,2,3 but end data not print -last index
		String substring2 = data.substring(1, 5);
		System.out.println(substring2);
		
		//lowercase
		String name="TestLeaf";
		String lowerCase = name.toLowerCase();
		
		System.out.println(lowerCase);
		
		//uppercase
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		
		//converting String number to integer number
		//parseInt
		String price="56";
	
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		
	}

}
