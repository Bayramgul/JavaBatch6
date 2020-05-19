package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	/*
	 * How would handle InputMismatchException? Input Mismatch Exception when user
	 * enters mismatch value then programmer expected.
	 */

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		try {
			int number=scan.nextInt();
			System.out.println( number);
		}catch(InputMismatchException im) {
			System.out.println(im);
			System.out.println(im.getMessage());
			im.printStackTrace();
		}
		
	}

}
