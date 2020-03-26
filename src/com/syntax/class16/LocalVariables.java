package com.syntax.class16;

public class LocalVariables {
	void nameInside() {
		String name = "John";// local variable that is visible only within method it was declared, i can't sop
								// this directly inside of main method;
	}

	public static void main(String[] args) {
		boolean flag = true;
		if (flag) {
			String answer = "yes";
		} // System.out.println(answer); will give error bcuz answer is local inside of
			// condition.
	}

}
