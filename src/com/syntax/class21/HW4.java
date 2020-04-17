package com.syntax.class21;

public class HW4 {
	// Create 1 class with a private method that has
	// 3 overloaded forms. Then call
	// each overloaded method with specific arguments and observe result.
	private void print(int i) {
		System.out.println(i);
	}

	private void print(int i, int j) {
		System.out.println("Multiplication of " + i + " and "+ j +" is: " + (i * j));
	}

	private void print(int k, int l, String operator) {
		System.out.println(operator + " of " + k + " and " +l+" is: "+ (k + l));
	}

	private void print(double k, int l, String operator) {// division
		System.out.println(operator + " of " + k + " and "+ l + " is: "+(k / l));
	}

	public static void main(String[] args) {
		// we can only overload private methods within the class
		HW4 obj1=new HW4();
		obj1.print(1);
		obj1.print(12, 2);
		obj1.print(15, 5, "Sum");
		obj1.print(20.5, 4, "Division");

	}
}