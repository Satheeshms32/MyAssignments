package week1.day1;

import java.util.Arrays;

public class LearnArrayWithAnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"vidhya","Dilip","Raghu","Aravind","Kathir","Jagadeesh","Mukesh"};
		int len = names.length;
		System.out.println(len);
		System.out.println(names[3]);
		//to sort an array
		//since its an static method no need to create any object
		Arrays.sort(names);
		for(int i = len-1; i >=0; i--) {
			System.out.println(names[i]);
		}
		for(int j = 0; j <len; j++) {
				System.out.println(names[j]);
			
		}
		int[] nums = new int[6];
		nums[0]=34;
		nums[1]=54;
		nums[2]=64;
		nums[0]=74;
		nums[0]=84;
		nums[0]=94;
		for (int i =0; i < nums.length; i++) {
		
		
			System.out.println(nums[i]);
		}
	}
}
		
		
