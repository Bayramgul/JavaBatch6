package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		// Create a String and print it in reverse order(Sunday-->yadnuS)
		String str = "Sunday";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}System.out.println("__________");
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
		// Write a program that reads two people’s first names and if they expecting boy
		// or girl?
		String str1="Wednesday";
		if(!(str1.isEmpty())) {
			if(str1.length()%2!=0 || str1.length()>=3) {
			System.out.println(str1.charAt(str1.length()/2));
		}
			
		}
	}

}
