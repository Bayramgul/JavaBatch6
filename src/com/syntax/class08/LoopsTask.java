package com.syntax.class08;

import java.util.Scanner;

public class LoopsTask {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 */
		System.out.println("Task1==============");
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		/*
		 * Create a program that will be asking user to apply for a credit card 10
		 * times. As soon you get an “yes” from a user program should stop asking.
		 * 
		 */
		System.out.println("Task2==================");
		Scanner scan = new Scanner(System.in);

		String answer = null;
		for (int x = 1; x <= 10; x++) {
			System.out.println("Do you want to apply for a credit card?");
			answer = scan.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				break;
			}
		}
		System.out.println("Task 3=============");
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 * 
		 */

		System.out.println("Please tell the starting point of a range");
		int start = scan.nextInt();
		System.out.println("Please tell the ending point of a range");
		int end = scan.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				oddSum = oddSum + i;
			} else {
				evenSum = evenSum + i;
			}

		}
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println("Task 4=====================");

		
		
		
		
		
		
	}

}
