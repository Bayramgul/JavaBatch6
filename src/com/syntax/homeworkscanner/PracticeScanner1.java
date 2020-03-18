package com.syntax.homeworkscanner;

import java.util.Scanner;

public class PracticeScanner1 {

	public static void main(String[] args) {
		// Write a program to take two integer inputs from user and print sum and product of them.
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Tell me a number");
		int num1=keyboard.nextInt();
		System.out.println("Tell me another number");
		int num2=keyboard.nextInt();
		int sum=num1+num2;
		System.out.println("The sume of the 1st and 2nd num is: "+sum);
		

	}

}
