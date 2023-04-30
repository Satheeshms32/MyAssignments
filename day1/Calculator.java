package week1.day1;

import static org.testng.Assert.assertEquals;

import org.apache.commons.math3.analysis.function.Add;

public class Calculator {
	public int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	public int mul(int x, int y) {
		int result = x*y;
		return result;
	}
	public void sub() {
		System.out.println("no argument in this");
	}
}