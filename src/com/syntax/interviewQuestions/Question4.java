package com.syntax.interviewQuestions;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//Find out how many alpha characters are present in a String?  Find number of words in string?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		
		String text=scan.nextLine().trim();
		
		String alpha=text.replaceAll("[^A-Za-z]","");
		System.out.println("The number of letters is: "+alpha.length());
		
		String []word=text.replaceAll("[^A-Za-z\\s]", "").split(" ");
		
		System.out.println("The number of words is: "+word.length);
		
		
	}

}
