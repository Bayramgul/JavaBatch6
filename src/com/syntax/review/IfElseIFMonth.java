package com.syntax.review;

import java.util.Scanner;

public class IfElseIFMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the month number");
		int month = scan.nextInt();
		String name = null;
		switch (month) {
		case 1:
			name = "Jan";
			break;
		case 2:
			name = "Feb";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "Aug";
			break;
		case 9:
			name = "Sep";
			break;
		case 10:
			name = "Oct";
			break;
		case 11:
			name = "Nov";
			break;
		case 12:
			name = "Dec";
			break;
			default:
				name="We are done";
				
				
		}
		
		
		System.out.println(name);
	}

}
