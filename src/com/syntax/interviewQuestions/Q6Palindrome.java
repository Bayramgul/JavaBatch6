package com.syntax.interviewQuestions;

import java.util.Scanner;

public class Q6Palindrome {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		String str, rev = "";
	      Scanner scan = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = scan.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);//reverse of a given String
	 
	      if (str.equalsIgnoreCase(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}

}
