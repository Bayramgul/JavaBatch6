package com.syntax.review;

import java.util.Scanner;

public class LoopsFactorial {

	public static void main(String[] args) {
		//Write a program to find the factorial value of any number entered through the keyboard. 
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any positive integer");
		int num=scan.nextInt();
		int i;
		int fact=1;
		for(i=1; i<=num;i++) {
			fact *=i;//fact 3!=3*2*1; i=1; 2;3; 
			
		}System.out.println("Factorial of "+ num +" is "+fact);
		
	
	}

}
