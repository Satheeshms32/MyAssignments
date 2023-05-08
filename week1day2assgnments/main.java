package week1day2assgnments;

public class main {
	public static String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[\\W]+", "");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
