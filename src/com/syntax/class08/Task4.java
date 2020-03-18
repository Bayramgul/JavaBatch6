package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		
		
		
		
		System.out.println("Please enter an item you want to buy");
		String item=scan.nextLine();
		
		System.out.println("Please enter the price of that item");
		double price=scan.nextDouble();
		
		while (price>0){System.out.println("Please enter your amount");
		double amount=scan.nextDouble();
		
		double needed=price -amount;
		double change=amount-price;
		if  (price<amount) {
			System.out.println("your change  amount is "+ change);
			 }
		
		
		if (price>amount) {System.out.println("Your needed amount is "+ needed);}
		
		else {
			System.out.println("Thank you for shopping");
		}
		}
			
		}
			
	}


