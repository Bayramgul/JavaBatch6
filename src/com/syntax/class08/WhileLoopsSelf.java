package com.syntax.class08;

import java.util.Scanner;

public class WhileLoopsSelf {

	public static void main(String[] args) {
		/*
		 * Exercise 1: By using do while loop, write Java program to prompt the user to
		 * choose the correct answer from a list of answer choices of a question. The
		 * user can choose to continue answering the question or stop answering it. See
		 * the example below: What is the command keyword to exit a loop in Java? a. int
		 * b. continue c. break d. exit Enter your choice: b Incorrect! Again? press y
		 * to continue:
		 */
		Scanner scan = new Scanner(System.in);
		char answer;
		String answer1;
		System.out.println("Please choose the correct answer choice for the following question:"
				+ "What is the command keyword to exit a loop in Java?\n" + "		 * a. int\n"
				+ "		 * b. continue\n" + "		 * c. break\n" + "		 * d. exit");
		do {
			System.out.println("Please enter your choice below");
			answer = scan.next().charAt(0);
			if (answer == 'c') {
				System.out.println("Congratulations");
				break;
			} else if (answer == 'a' || answer == 'b' || answer == 'd') {
				System.out.println("Incorrect");
			}

			System.out.println("Would you like to continue anwering(yes/no)?");
			answer1 = scan.nextLine();

		} while (answer1.equalsIgnoreCase("Yes"));

	}

}
