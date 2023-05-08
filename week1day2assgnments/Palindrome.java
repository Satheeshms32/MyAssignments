package week1day2assgnments;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String str1 = "";
		int len = str.length();
		//System.out.println(len);
		for(int i =0; i<str.length(); i--);{
			char[]ch = str.toCharArray();
			str1 = str+str1;
		
		System.out.println(ch);
		}
		if(str.equals(str1)) {
			System.out.println("Given string is Palindrome");
		}
		else {
			System.out.println("Given string is not Palindrome");
		}
			
			
		
		
		
		
		
		
		
	///		char[] ch = input1.toCharArray();
		///for(int i = ch.length-1; i >=0; i--) {
		///	System.out.println(ch[i]);
			}///
		

	}



