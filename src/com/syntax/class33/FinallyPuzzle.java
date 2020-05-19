package com.syntax.class33;

import java.util.Scanner;

public class FinallyPuzzle {
	//QUESTION:  will the compile complain: try with finally without catch?
	public static void main(String[] args) {
		//THE ANSWER: no the compiler will not complain, but the exception will not be handled, finally will help us to execute piece of code
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		try {
			int num=scan.nextInt();
			}finally {
			scan.close();
		}
		System.out.println("The code continues");
	}

}
