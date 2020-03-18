package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 10;
		double num3 = 10.99;
		double num4 = 11.99;
		int sum = num1 + num2;
		double sum1 = num3 + num4;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		double sum3 = num1 + num3;
		double num5 = 3.9;
		double square = 3.9 * 3.9;
		int width = 5;
		int height = 8;
		int perim = 2*(width + height);
		int area = width * height;
		// The result of the division is
		System.out.println("The result of the division is: " + div);
		// Task1
		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + "  equals to " + sum);
		// Task2
		System.out.println("The square of the " + num5 + "is" + square);
		// Task3
		System.out.println("The perimeter of a rectangle with width" + width + " and height " + height + " is equal to "
				+ perim + " and the area is " + area);

	}

}
