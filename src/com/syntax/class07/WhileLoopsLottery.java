package com.syntax.class07;

import java.util.Scanner;

public class WhileLoopsLottery {

	public static void main(String[] args) {
		//we are playing a lottery and a lucky number is 17;
		//we want to keep asking user any number from 1-20
		//until he guess the lucky number --->congrats
		Scanner scan=new Scanner(System.in);
		int num=1;
		int luckyNumber=17;
		do {System.out.println("Please enter any number between 1-20");
		num=scan.nextInt();
			//when you don't know how many ways to execute the code USE while loops
		}while(num!=luckyNumber);{
			
			System.out.println("Congratulations!You are lucky , you won the lottery$$$$");
			
		
		}
		//second way
		while (num<=20) {if (num!=17) {System.out.println("Please enter any number between 1-20");
		num=scan.nextInt();
			
		}else if(num==17) {
			System.out.println("Congratulations!You are lucky , you won the lottery$$$$");
			
		}
			
		}
	}

}
