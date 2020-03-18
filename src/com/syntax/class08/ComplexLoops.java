package com.syntax.class08;

import java.util.Scanner;

public class ComplexLoops {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off the amount. If user give more money program
		 * should return a change. Whenever a user done with payments program should say
		 * “Thank you for shopping!”
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String item;
		double price=0.0;
		double money=0.0;
		double needed =price-money;
		double change;
		double amount=0.0;
		System.out.println("Please enter the item you want to buy?");
		item=scan.nextLine();
		System.out.println("Please enter the price of "+ item);
		price=scan.nextDouble();
		do { System.out.println("Please pay the money");
		money=scan.nextDouble();
		amount=amount+money;
		if(amount<price) {
			needed=price -amount;
			System.out.println("Please pay more "+ needed);
			money=scan.nextDouble();
			amount=amount+money;
			
			if (amount==price) {System.out.println("Thank you!");
				}
			}
			else if(amount>price ) {
				change=amount-price;
				System.out.println("Here is your change "+change);
				
				break;
			}
			
		}while(amount!=price);
			System.out.println("Thank you for shopping!");
		}
		
		
	}


