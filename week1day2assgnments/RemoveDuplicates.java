package week1day2assgnments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String rev ="";
		String[] arrsplit = text.split(" ");
		for(int i=0; i<arrsplit.length; i++) {
			for(int j = i+1;j<arrsplit.length;j++) {
				if(arrsplit[i].equalsIgnoreCase(arrsplit[j])) {
					rev=arrsplit[i];
					count++;
				}
			}
					  
				}
		 if(count>0) {
			 //String replaceValue = text.replace(rev, "");
			 //System.out.println(replaceValue);
		 
			 for(int k=0;k<split.length;k++) {
				 System.out.println(split[k]+"");
		 }
				
	}
	}
}
	

			String strValue = "We learn java basics as part of java sessions in java week1";
			int count = 0;
			String[] split = strValue.split(" ");
			
			
		
		
		
		
		
		
	}

}
