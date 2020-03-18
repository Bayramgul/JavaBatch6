package com.syntax.class08;

import java.util.Scanner;

public class WhileLoopsSelfStudy {

	public static void main(String[] args) {
		/*
		 * Write a program to enter the numbers till the user wants and at the end the
		 * program should display the largest and smallest numbers entered.
		 */
//		Scanner scan=new Scanner(System.in);
//		
//		int i = 0;
//		int min=Integer.MIN_VALUE;
//		int max=Integer.MAX_VALUE;
//		char answer;
//		do {System.out.println("Please enter any number");
//		int num=scan.nextInt();
//		if (max>num) {num=max;
//			
//		}else if (min<num) {
//			num=min;
//		}System.out.println("DO you want to continue Y/N?");
//		 answer=scan.next().charAt(0);
//			
//		}while(answer=='y'||answer=='Y');
//	System.out.println("The greatest number is "+ max);
//	System.out.println("The smallest number is "+ min);
//		
Scanner console = new Scanner(System.in);
        
        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > max)
            {
                max = number;
            }
            
            if(number < min)
            {
                min = number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
		
	}
	

}
