package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 != 0) {
			System.out.println(i);
		}
		
				
	}
		
			    // Input number
			    int n = 11;

			    // Holds the count of values
			    int count = 0;

			    // There is no prime number less than 2.
			    if (n <= 1) {
			      System.out.println("The number is not prime");
			      return;
			    }

			    // Do a for loop
			    for (int i = 1; i <= n / 2; i++) {
			      if (n % i == 0) {
			        count++;
			      }
			    }

			    // If the number of factors is greater than 1,
			    // the number is not prime.
			    if (count > 1) {
			        System.out.println("The number is not prime");
			    }
			    else {
			      System.out.println("The number is prime");
			    }
			  }
			
	

}