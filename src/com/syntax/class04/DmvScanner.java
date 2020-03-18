package com.syntax.class04;

import java.util.Scanner;

public class DmvScanner {

	public static void main(String[] args) {
		Scanner dmv=new Scanner(System.in);
		System.out.println("Please enter your age!");
		
		int age =dmv.nextInt();
		if (age >=18) {
			System.out.println("You are eligible for Driver license");
		}else {
			System.out.println("You are eligible for leraners permit");
		}
		
	}

}
