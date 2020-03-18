package com.syntax.class11;

public class StringVerification {

	public static void main(String[] args) {
		String message="Welcome Admin!";
		//verify that message contains username which is Admin
		boolean flag=message.contains("Welcome");
		System.out.println(message.contains("Welcome"));
		System.out.println(message.contains("Admin"));
		//we want to see if welcome starts with Welcome
		boolean starts=message.startsWith("Welcome");
		System.out.println("Message starts with "+starts);
		// verify that message ends with username 
		String username="Admin";
		boolean ends= message.endsWith(username);
		System.out.println("message ends with "+ username);
		System.out.println(message.concat(message));
		
		
	}
	
}
