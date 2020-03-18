package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		/*
		 * We have total 7 days in a week if day is 2 or 3 -->SDLC Class if day
		 * 6,7==>Java class if day 51,5==>off day if day 4==>review class
		 */
		int day = 2;
		if (day == 2 || day == 3) {
			System.out.println("Today is SDLC Class");

		} else if (day == 6 || day == 7) {
			System.out.println("Today is JAva Class");
		} else if (day == 1 || day == 5) {
			System.out.println("Today is no Class, it is day off");
		} else if (day == 4) {
			System.out.println("Today is a review class with Elion");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("__________________________");
		// To compare String we use .equals
		String day1 = "Monday";
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");

		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java Class");
		} else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("No class today");
		} else if (day1.equals("Thursday")) {
			System.out.println("Review class with Elion");
		} else {
			System.out.println("Invalid day");
		}
	}
}
