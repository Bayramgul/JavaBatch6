package com.syntax.interviewQuestions;

public class Fibonacci {

	public static void main(String[] args) {
//		int number = 10, num1 = 0, num2 = 1;
//		System.out.print("First " + number + " terms: ");
//		for (int i = 1; i <= number; ++i) {
//			System.out.print(num1 + ",");
//			int sum = num1 + num2;
//			num1 = num2;
//			num2 = sum;
//		}

		// 1 1 3 5 8 13 21
		int first = 0;
		int second = 1;
		int third;//sum
		for (int i = 0; i < 8; i++) {
			third = first + second;//0+1=1
			System.out.println(third);
			first = second;//a=1
			second = third;//b=1
			
		}
	}

}
