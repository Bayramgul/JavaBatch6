package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		/*Take age input from a user and then based on the print output
		 * if age from 0-3 --->you are a baby
		 * if age from 4-5 --->you are a kid
		 * if age from 6-12 --->you are a child
		 * if age from 13-19  --->you are a teenager
		 * if age from 20-64 --->you are an adult
		 * if age is more or equal to 65 --->you are a senior
		 */
		int age;
		Scanner i=new Scanner(System.in);
		System.out.println("Please enter your age");
		 age=i.nextInt();
		
		if (age >=0 && age <3 ) {
			System.out.println("you are a baby");
		}else if (age >=4 && age <=5) {
			System.out.println("you are a kid");
		}else if (age >=6 && age <=12) {
			System.out.println("you are a child");
		}else if (age >=13 && age <=19) {System.out.println("you are a teenager");
			
		}else if (age>=20 && age<=64) {
			System.out.println("you are an adult");
		}else if (age>=65) {
			System.out.println("you are a senior");
		}
		
	}

}
