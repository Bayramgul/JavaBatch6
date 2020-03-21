package com.syntax.class13;

import java.util.Scanner;

public class MethodWithParameters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 Hello hello=new Hello();//created an object for the Hello classs
		 System.out.println("Please enter your name: ");
		String name=scan.nextLine();//assigned the name to the scanner input
		hello.greetings(name);
		
	}

}
	 class Hello{
		 public static void greetings(String name) {//method with parameters
			 System.out.println("Hello "+ name);// i have to invoke this code in main method to run it;
		 }
	
}