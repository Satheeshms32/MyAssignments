package week1day2assgnments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Tes12Le79af65";
		int sum = 0;
		System.out.println(test);
		int len = test.length();
		char[]ch = test.toCharArray();
		test.replaceAll("\\D+", "");
		System.out.println(test);
		String[] strArray = test.split(" ");
		
        
		//strArray = test.split(" ");  
		//printing the converted string array  
		for (int i = 0; i< strArray.length; i++){  
		System.out.println(strArray[i]);  
		}  
		//char n = 0;
		//int second = Character.getNumericValue();
	   // System.out.println("int value: " + second);
		
	}

}
