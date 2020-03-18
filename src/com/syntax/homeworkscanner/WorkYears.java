package com.syntax.homeworkscanner;

import java.util.Scanner;

public class WorkYears {

	public static void main(String[] args) {
		
		Scanner work=new Scanner(System.in); 
		System.out.println("How many years you worked?");
		int workedYears=work.nextInt();
		System.out.println("What is your annual salary?");
		int salary=work.nextInt();
		if (workedYears>=5) {
			System.out.println("You are eligible for bonus!");
			if (salary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
			
		}else {
			System.out.println("You are not eligible for bonus");
		}
	
		
	}

}
