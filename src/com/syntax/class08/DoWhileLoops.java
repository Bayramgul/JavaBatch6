package com.syntax.class08;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		/*
		 * Write a do-while loop that asks the user to enter two numbers. The numbers
		 * should be added and the sum displayed. The loop should ask the user whether
		 * he or she wishes to perform the operation again. If so, the loop should
		 * repeat; otherwise it should terminate.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		char answer;
		do {System.out.println("Please enter any  two numbers!");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum=num1+num2;
		System.out.println("The sum of two numbers is "+ sum);
		System.out.println("Do you want to perform the operation again (Y/N?");
		 answer=scan.next().charAt(0);
		
		}while(answer =='Y'|| answer=='y');
	}

}
