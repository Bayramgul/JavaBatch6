package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String language;
		String country;
		System.out.println("Please enter your country");
		country=scan.nextLine();
		switch (country) {
		case "USA":
			language="English";break;
		case "Turkmenistan":
			language="Turkmen"; break;
		case "Russia":
			language="Russian";break;
			default:
				language="language is not verified";
		}
		System.out.println("You speak "+ language);

	}

}
