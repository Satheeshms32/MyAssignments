package week1.day1;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		int len = nums.length;
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j < len; j++) {
				if (nums[i]==nums[j]) {
					System.out.println(nums[j]);
					
					
				}
			}
			
		}
		
		//method2
		Arrays.sort(nums);
		for (int i =0; i <nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
		
		}
		}

	}

}
