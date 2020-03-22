package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// Create a method createEmail(). Based on provided users name, lastName and
		// email type, your method should return complete email Address. Example:
		// johnsnow@gmail.com or johnsnow@yahoo.com*
		
		Task1 obj=new Task1();
		String email=obj.createEmail("John","Smith", "@gmail.com");
		String email1=obj.createEmail("John","Snow", "@yahoo.com");
		System.out.println(email);
		System.out.println(email1);
		
	}

	
	String createEmail (String name, String lastName, String emailType){
		
		String email=name.concat(lastName).concat(emailType).toLowerCase();
		return email;
	}
}
