package com.syntax.review;

import java.util.Scanner;

public class SelfstudyLoops {

	public static void main(String[] args) {
		// Question #1. Write a program to print numbers from 1 to 10.
		int a;
		for (a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("Question num2----------------");

		// Question 2. Write a program to calculate the sum of first 10 natural number.
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("Sum is :" + sum);
		System.out.println("Question num 3---------------");

		// Write a program that prompts the user to input a positive integer. It should
		// then print the multiplication table of that number.
		
		System.out.println("Please write positive integer");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int mult=0;
		int x;
		for (x=1; x<=10; x++) {
			mult=num*x;System.out.println(mult);
		}
		System.out.println("Question 3 another version____________________");
		System.out.println("Please enter positive integer");
		int n=scan.nextInt();
		int y;
		int multi;
		System.out.println("Multipliaction table of "+ n);
		for (y=1;y<=10;y++) {
			System.out.println(n+ "x"+y+"="+ (n*y));
		}
		
		
		
	}

}
