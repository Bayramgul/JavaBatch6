package com.syntax.homeworkscanner;

import java.util.Scanner;

public class ScannerHW {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Please say True or False!");
		Boolean card=user.nextBoolean();
		
		if (card) {
			System.out.println("What is your card balance");
			
			int cardBalance=user.nextInt();
			if (cardBalance>1000) {
				System.out.println("Pay off immediately!");
			}else {
				System.out.println("You can spend more!");
			}
			
		}else {System.out.println("Let's open a credit card here!");
			
		}
	
	}
	
}



