package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		//Bring Scanner class into a program.System.in identifies keyboard, user input
		Scanner scan =new Scanner(System.in);
									//Capture name from a user and
									//print in the format
									//My name is ____
		
		//Instruct user what program expects
		System.out.println("Please enter your name");
		//Capture line of Strings from a user
		String name=scan.nextLine();

		//Instruct user what program expects
		System.out.println("My name is "+ name);
		System.out.println("How old are you?");
		//capture number from user
		int age=scan.nextInt();
		
		System.out.println("Your name is "+ name+" and you are "+ age);
		
	}

}
