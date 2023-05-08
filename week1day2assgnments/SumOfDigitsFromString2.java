package week1day2assgnments;

import java.util.Iterator;

public class SumOfDigitsFromString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Tes12Le79af65";
		String replaceAll = test.replaceAll("\\D", "");
		char[]ch = replaceAll.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			int numericValue = Character.getNumericValue(ch[i]);
			sum = sum+numericValue;
			System.out.println(sum);
			
		}
		
		System.out.println(sum);
	}

}
