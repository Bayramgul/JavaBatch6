package com.syntax.class15;

public class Calculator {

	// define methods to calculate add, sub, div, mult

	// we can declare data types inside of method parameters
	void add(int a, int b) {// hard copying some variable is not usable
		System.out.println(a + b);
	}

	// we create a method with name sub that accept 2 parameters of integer type
	void sub(int a, int b) {
		System.out.println(a - b);
	}

	void mult(int a, int b) {
		System.out.println(a * b);
	}

	void div(double a, double b) {
		System.out.println(a / b);

	}

}
