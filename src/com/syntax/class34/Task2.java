package com.syntax.class34;

public class Task2 {
	/*
	 * Create a method checkUserName that will throw a runtime exception. Method
	 * should throw an exception when entered username is less than 5 characters.
	 * 
	 */

	public static void main(String[] args) {
		
		checkUserName("Gul");
	}
	public static void checkUserName(String username) {
		if(username.length()<5) {
			throw new RuntimeException("Your usrname should be more than 5 charcters");
		}else {
			System.out.println("you username contains: "+username.length()+" characters");
		}
	}

}
