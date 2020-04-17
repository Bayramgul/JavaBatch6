package com.syntax.class21;

public class HW3 {
	// Create 1 class with a static method that has 3 overloaded forms. Then call
	// each overloaded method with specific arguments and observe result.
	String language;
	static void coding (String language){
		System.out.println("I am learning programming in "+ language);
	}
	  static void coding (String language, String lang1){
			System.out.println("I am learning coding in "+ language+ " and "+ lang1);
		}
	  static void coding (String language, String lang1, String lang2){
			System.out.println("First i will learn "+ language+ " then, "+ lang1+ " and "+ lang2);
		}
	  static void coding (String language, String lang1, String lang2, int num){
			System.out.println("First i will learn "+num +" languages: "+ language+ " ,"+ lang1+ " and "+ lang2);
		}

}// when we overload methods even though it is static we can have changes 
