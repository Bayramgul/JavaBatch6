package com.syntax.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password from a user and check
		 * following requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=“Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=“Password is too short”. Password cannot contain username if so, →
		 * message=“Password cannot contain username”. Password should match confirmed
		 * password, if not → message=“Passwords do not match”.
		 * 
		 * Only after all requirements met → message “Your username and password has
		 * been created”
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your username: ");
		String username = scan.nextLine();
		System.out.print("Please enter your password: ");
		String password = scan.nextLine();
		System.out.println("Please confirm your password");
			String confirmedPassword = scan.nextLine();
			if(username.isEmpty() || password.isEmpty()) {
				System.out.println("Username and Password cannot be empty");
				
			}else {if(password.length()<8) {
				System.out.println("Password is too short");
			}	
			if(password.contains(username)) {
				System.out.println("Password cannot contain username");
			}if(!(password.equals(confirmedPassword)) ){
				System.out.println("Passwords do not match");
			}else if (password.equals(confirmedPassword)&& !password.contains(username)&&password.length()>=8){
				System.out.println("Your username and password has been created");
			}
				
			}
			
		
}}
