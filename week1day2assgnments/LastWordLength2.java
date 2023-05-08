package week1day2assgnments;

public class LastWordLength2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String	s = "Hello World";
		String[] split = s.split(" ");
		int length = split.length;
		System.out.println(length);
		System.out.println(split[split.length-1]);
		System.out.println(split[split.length-1].length());
	}

}
