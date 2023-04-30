package week1.day1;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ti find the length of array
		//ctrl+2->release and then press l-> to assign to a variable
			int[] scores = {89,98,80,78,92};
			int len = scores.length;
			System.out.println("The length of this array is:"+len);
			//to retrieve a single element from an array
			System.out.println(scores[2]);//80
			//to print all the datas of an array
			for(int i =0; i < len; i++) {
				System.out.println(scores[i]);//scores[0]=89
				//array index outofboundexceptions
			}
		}
	}


