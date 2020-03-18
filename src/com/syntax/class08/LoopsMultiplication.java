package com.syntax.class08;

import java.util.Scanner;

public class LoopsMultiplication {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		System.out.println("Please enter positive integer");
		int n=scan.nextInt();
		int y;
		int multi;
		System.out.println("Multipliaction table of "+ n);
		for (y=1;y<=10;y++) {
			System.out.println(n+ "x"+y+"="+ (n*y));
	}
	}
}
