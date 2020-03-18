package com.syntax.class06;

import java.util.Scanner;

public class Task2GradeSwitch {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		
		Scanner i=new Scanner(System.in);
		char grade;
		String GradeExplain;
		System.out.println("Please enter your grade below as (A,B,C or D)");
		grade=i.next().charAt(0);
		switch(grade) {
		case'A':
			GradeExplain="Excellent";break;
		case'B':
			GradeExplain="Good";break;
		case'C':
			GradeExplain="Average";break;
		case'D':
			GradeExplain="Bad";break;
			default:
				GradeExplain="Not Acceptable";
		}
		System.out.println("You entered "+ grade + " grade and it is "+ GradeExplain);
	}

}
