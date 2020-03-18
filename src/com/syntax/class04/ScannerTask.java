package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		Scanner loan=new Scanner(System.in);
		System.out.println("Please tell the amount of your loan!");
		int yourLoan=loan.nextInt();
		
		if (yourLoan < 200000) {System.out.println("I will lend you money");
			
		}else {
			System.out.println("I will not lend you money");
		}
	}

}
