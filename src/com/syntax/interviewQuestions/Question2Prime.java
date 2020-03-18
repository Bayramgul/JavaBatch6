package com.syntax.interviewQuestions;

import java.util.Scanner;

public class Question2Prime {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("please enter number greater than 1");
		while(true) {//just for the while loop to start
			 num=scan.nextInt();
			if(num>1) {break;
			}System.out.println("Please enter valid number");
		}
	
		if (num==2) {//2 is the very first prime number 
			System.out.println("This is prime number");
		}else {
			for(int i=2; i<num;i++) {
				if(num%i==0) {System.out.println("This number is not prime");break;
				} if(i==num-1) {//to check if the i is number before the user's number/last i;
					System.out.println("This is a prime number");
				}
					
				
					
			}
		}
		
	}

}
