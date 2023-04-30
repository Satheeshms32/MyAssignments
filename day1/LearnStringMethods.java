package week1.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string literal
		String str = "TestLeaf";
		//find the length of the string
		int len = str.length();
		System.out.println(len);
		//to check the part of the String
		str=str.toLowerCase();
		//str=str.toUpperCase();//TESTLEAF
		boolean isPresent = str.contains("leaf");
		//if it contains it will return a boolean value
		System.out.println(isPresent);
		
		if(str.contains("leaf") || str.contains("Leaf")) {
			System.out.println("Is Present");
		}
		else {
			System.out.println("Not Present");
		}
		
		//to convert string to charArray
		//char[] ch = str.
		
		
		
			
		
		
		
		
		}
		
	}

}
