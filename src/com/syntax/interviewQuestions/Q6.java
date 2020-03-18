package com.syntax.interviewQuestions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String rev="";
		String text=scan.nextLine();//anna -->l=4; 
		int length=text.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+text.charAt(i);
		}
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
	}

}
