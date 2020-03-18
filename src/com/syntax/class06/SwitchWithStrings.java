package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/*
		 * ask a user where he or she is from based on the country we will define
		 * favorite food your favorite food is ___
		 */
		String country;
		String favoriteFood;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		switch(country.toLowerCase()) {
		case "Morocco":
			favoriteFood="couscous";
			break;
		case "Turkmenistan":
			favoriteFood="manty";break;
		case "Russia":
			favoriteFood="borch";break;
		case "Kazakhistan":
			favoriteFood="besh parmak";break;
		case "Iran":
			favoriteFood="ghormeh sebzi";break;
		case "Tajikhistan":
			favoriteFood="Osh";break;
		default:
			favoriteFood="Unknown";
			
		}
		System.out.println("Your favorite food is "+ favoriteFood);
	}

}
