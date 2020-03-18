package com.syntax.review;

import java.util.Scanner;

public class CharNestedIfScanner {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter their age "Please enter your age" and his/her gender
		 * "Please enter your gender: M or F"
		 * 
		 * You have 2 conditions: If age is above 25, then check if a user entered F
		 * then the output should be "Woman" otherwise it should say "Man" If age is
		 * below 25, then check if a user entered F then the output should be "Girl"
		 * otherwise it should say "Boy"
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age =in.nextInt();
		
		System.out.println("Please enter your gender: M or F");
		//char gender=in.next().charAt(0);
		String gender=in.next();
		if (age>25) {
			if (gender.equalsIgnoreCase("F")) {System.out.println("Woman");
			//if(gender=='F')	
			}else {
				System.out.println("Man");
			}
			
		}else if (age<25 ) {
			if (gender.equalsIgnoreCase("F")) {
				System.out.println("Girl");
			}else {
				System.out.println("Boy");
			}
		}
		
	}

}
