package com.syntax.review;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		/*
		 * If the user pressed number keys( from 0 to 9), the program will tell the
		 * number that is pressed, otherwise, program will show "Not allowed".
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any  number");
		int num=sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		case 7:
			System.out.println("7");
			break;
		case 8:
			System.out.println("8");
			break;
		case 9:
			System.out.println("9");
			default:
				System.out.println("Not allowed");
			
		}
	}

}
