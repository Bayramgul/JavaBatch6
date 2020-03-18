package com.syntax.homeworkscanner;

import java.util.Scanner;

public class PracticeYes {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("Please choose one of the states mentioned here: VA,NY, TX, NC");
		String states=in.nextLine();
		
		if (states.equalsIgnoreCase("VA")) {
			System.out.println("Welcome to Virginia");
		}else if (states.equalsIgnoreCase("NY")) {
			System.out.println("Wecome to NY");
		}else if (states.equalsIgnoreCase("TX")) {
			System.out.println("Welcome to Texas");
		}
		
	}

}
