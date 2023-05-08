package week1day2assgnments;

public class FindIntersections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int len = arr1.length;
		int len1 = arr2.length;
		//System.out.println("The length of this array is:"+len);
		//System.out.println("The length of this array is:"+len1);
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					
				}
			}
		}
			}
			
		}
		


