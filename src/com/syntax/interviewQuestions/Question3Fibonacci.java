package com.syntax.interviewQuestions;

public class Question3Fibonacci {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		int[] fib = new int[10];// array holds 10 elements
		fib[0] = 0;// 1st fibonacci number
		fib[1] = 1;// 2nd fibonacci number
		
		for (int i = 2; i < 10; i++) {// to find rest fibonacci until 10
			fib[i] = fib[i - 1] + fib[i - 2];// hesap
			System.out.println(fib[i]);
		}
//		for (int j = 0; j < 10; j++) {// number of index
//			System.out.print(fibonacci[j] + " ");
//		}
	}

}
