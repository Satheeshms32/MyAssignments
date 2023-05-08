package week1day2assgnments;

import java.util.Arrays;



public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		//int res = n*(n+1)/2;
		Arrays.sort(arr);
		int j = 0;
		int len = arr.length;
		for(int i = 0; i<len; i++) {
			//System.out.println(arr[i]);
			j = i+1;
			if(arr[i] != j ) {
				System.out.println(j);
				break;
			//	return arr[i]-1;
				
				
				
			}
		
		
			
		}
		//return arr[len-1]+1;
	}

}
