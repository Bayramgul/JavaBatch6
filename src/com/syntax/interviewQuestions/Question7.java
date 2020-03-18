package com.syntax.interviewQuestions;

public class Question7 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?
		int[] a = { 12, 34, 67, 89, 23, 98 };
		int max = a[0];
		int min = a[0];
		int second = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			} else if (a[i] < min) {
				min = a[i];
			}
		}
		for (int j = 0; j < a.length; j++) {
			if(a[j]>second&& a[j]!=max) {
				second=a[j];
			}
		}
		System.out.println("The largest number is: " + max);
		System.out.println("The second largest number is: " + second);
		System.out.println("The min number is: " + min);

	}

}
