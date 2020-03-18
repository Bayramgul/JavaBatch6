package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/* 1. write a program to ask user if there is sale
		 * 2. if there is no sale -->we not going shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and calculate final price
		 * if price <20-->apply 10%
		 * if price is btw 20and 100 --->apply 20%
		 * if price is btw 100 and 500--->qpply30%
		 * if price more than 500-->apply 50%
		 * After discount ___ the price of the item reduced from ___ to ____
		 */
		
		String sale;
		int price=0;
		double discount=0.0;
		double finalPrice;
		System.out.println("Is there any sale?");
		Scanner scan=new Scanner(System.in);
		 sale =scan.nextLine();
		if (sale.equalsIgnoreCase("yes")) {System.out.println("What is the price of the item");
		 price=scan.nextInt();
		 if (price <20) {
			 discount=price*0.1;
		 }else if (price>=20 &&price<=100) {
			 discount=price*0.20;
		 }else if (price >100 && price <=500) {
			 discount=price *0.3;
		 }else if (price >500){
			 discount=price*0.5;
			 
		 }
		 finalPrice=price -discount;
			System.out.println("After discount the price of the item reduced from "+ price +" to "+ finalPrice );
		}else {
			System.out.println("We are not going to shopping");
		}
	}

}
