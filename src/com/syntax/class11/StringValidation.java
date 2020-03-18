package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		String str1="Welcome Syntax Students";
		String str2="Welcome Syntax students";
		// to compare 2 strings
		
		System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.contentEquals(str2));
		
		String expected="Home-Sytax Technologies";
		String actual="    Home-Sytax Technologies";
		if(actual.equals(expected)) {
			System.out.println("Test case pass.Titles are matched");
		}else {
			System.out.println("Test case fails.Titles are NOT matched");
			
		}
		//FIRST trim then compare
		if (actual.trim().equals(expected)) 
		{System.out.println("Test case pass.Titles are matched");
		}else {
			System.out.println("Test case fails.Titles are NOT matched");
		}String browser="Chrome";
		if (browser.equalsIgnoreCase("CHROME")) {
			System.out.println("this code is good to go");
		};
		
		
		
		
		
	}

}
