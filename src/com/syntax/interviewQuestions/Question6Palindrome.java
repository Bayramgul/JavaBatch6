package com.syntax.interviewQuestions;

public class Question6Palindrome {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		String text = "anna";
		boolean check=true;
		int i = 0;
		int j = text.length() - 1;
		while (i < j) {
			j--;
			i++;
			if (text.charAt(i) == (text.charAt(j))) {
				check=true;
				break;
			}else {
				check=false;
			}
			
		}
		if(check) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
		
		
	}

}
