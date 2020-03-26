package com.syntax.class17;

public class Task2 {

	public static void main(String[] args) {
		// Create a method that will take a String as a parameter and returns reverse
		// String. Method should be available to all classes within your projects and
		// accessible by class name.
		
		System.out.println(Task2.reverse("Asel"));
		
	}
	 static  String reverse (String name) {
		
	String rev="";
		for(int  i=name.length()-1;i>=0;i--) {
			rev+=name.charAt(i);
		
	}
		return rev;
}
}