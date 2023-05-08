package week1day2assgnments;

import java.util.Iterator;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			count = 1;
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equals(split[j])) {
					split[j] = "$";
					count ++;
				}
				
				
			}
			if(count>=1 && split[i]!="$") {
				System.out.print(split[i]+" ");
			}
		}
		
	}

}
