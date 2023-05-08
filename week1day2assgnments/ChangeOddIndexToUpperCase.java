package week1day2assgnments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String test = "changeme";
		int len = test.length();
		for (int i = 0; i < len; i++) {
			char ch = test.charAt(i);
			if (i % 2 != 0) {
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }
				
			}
	
	}	
	}
	

