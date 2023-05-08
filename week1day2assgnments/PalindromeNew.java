package week1day2assgnments;

import org.apache.commons.collections4.sequence.ReplacementsFinder;
import org.apache.commons.collections4.sequence.ReplacementsHandler;
import org.apache.poi.ss.formula.functions.Replace;
import java.util.regex.Pattern;

import com.mongodb.client.model.FindOneAndReplaceOptions;

import freemarker.core.ReturnInstruction.Return;
import net.bytebuddy.implementation.EqualsMethod;
import net.bytebuddy.matcher.EqualityMatcher;


public class PalindromeNew {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A man, a plan, a canal: Panama";
		//String str1 = "";
		int len = str.length();
		char[] ch = str.toCharArray();
		for(int i= ch.length-1;i>=0;i--) {
			for(int j = 0; j<ch.length; j++) {
				
				if(ch[i] == ch[j]) {
				
					
				break;
				}
			}
				
		}
		
		System.out.println("True");
		str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
				System.out.println(str);
				
					
				}

				
			
//System.out.println(ch[i]);	
					
		
}
			
		
		
		
			
	
	
		

	
		
	
	
	
	

