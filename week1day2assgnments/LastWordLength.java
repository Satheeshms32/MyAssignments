package week1day2assgnments;

public class LastWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String	s = "Hello World";
		//System.out.println("enter the string:"+s);
		s = s.trim();
	
		int start = s.length()-1;
		for (int i = start; i>=0; i--) {
			if(s.charAt(i) == ' '){
				break;
		//count ++;
					
			}
		count ++;
		System.out.println(s);
		}
		///return count;
	
		
		
	    
		
		
		
		
	
	
		
		
		

	}

}
