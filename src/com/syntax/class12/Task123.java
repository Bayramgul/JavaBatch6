package com.syntax.class12;

public class Task123 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new
		// String without any spaces.
		String sent = "I am so tired.";
		String s[] = sent.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many alpha characters are there in the String.

		String combi = "Bye12345&*()";
		combi = combi.replaceAll("[0-9]", "");
		combi = combi.replaceAll("[^A-Za-z0-9]", "");

		System.out.println(combi.length());

		// You have a String a=“Is it saturday? Is it raining? Do we have a Java Class
		// today?” How would you find out how many sentences are in that String?
		
		String a= "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String []Sentence=a.split("\\?");
		System.out.println(Sentence.length);
		
		
	
	}
}
