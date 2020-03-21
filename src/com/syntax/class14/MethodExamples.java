package com.syntax.class14;

public class MethodExamples {
	//
	void greet(String name) {
		System.out.println("Hello "+name);
	}
	void greet1() {
		System.out.println("Hello Serdar");
	}
	public static void main(String[] args) {
		MethodExamples object1=new MethodExamples ();
		object1.greet("Sarmed");
		object1.greet("Gulen");
		object1.greet("John");
		object1.greet("Kate");
		object1.greet1();
	}
}
