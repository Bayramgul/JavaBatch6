package com.syntax.review;

import java.util.Scanner;

public class ScannerSelfStudy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.next();
		
		
		System.out.println("What is your age?");
		
		int age =scan.nextInt();
		
		
		System.out.println("What is your hobby?");
		String hobby=scan.next();
		 
		System.out.println("What is your quote?");
		String quote=scan.next();
		String quotes=quote+scan.nextLine();
		
		System.out.println("Hello. "+ "Your name is "+ name+ " ,your age is "+ age+ " and your hobby is "+ hobby+". "+" Your quote is "+ quote);
		
	}

}
