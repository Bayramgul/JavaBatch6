package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double price;
		
		do {System.out.println("Please pay for a candy");
			price=scan.nextDouble();
		}while(price!=2);
		System.out.println("Enjoy your candy");
		
		//2nd way
		System.out.println("Please pay for a candy");
		price=scan.nextDouble();
		while(price!=2) {
			System.out.println("Please pay for a candy");
			price=scan.nextDouble();
		}System.out.println("Enjoy your candy");
		
		int total=2;
		for(int k=1;k<4;k++) {
			total=total*k;
		}
		System.out.println(total);
	} 

}
