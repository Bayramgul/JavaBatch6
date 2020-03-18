package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =“Summer”. At the end of the program we should see output as “You were born
		 * ______“.
		 */
		// create scanner object to capture user inputs
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your birth month name");
		String month = s.nextLine();
		// we have to declare and initialize the season first before updating according to the conditions
		// you can assign it like String season = ("Invalid season"); or String season=null; null is a default value of String
		String season=null;
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		}
		System.out.println("You were born in " + season);
	}

}
