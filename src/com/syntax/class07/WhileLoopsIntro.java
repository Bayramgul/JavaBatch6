package com.syntax.class07;

public class WhileLoopsIntro {

	public static void main(String[] args) {
		int time=10;
		if (time<12) {
			System.out.println("Good Morning");//code will execute only once
		}
		System.out.println("--------------WHILE LOOP----------");
//		while (time<12) {
//			System.out.println("Good Morning");//Code will execute infinitely
//		}
		while (time<=12) {
			System.out.println("good morning");//code will execute 3 times
			time++;//we use increment to change the condition
		}
		//how to print from 1 to 50?
		int a=1; 
		while(a<=50) {
			System.out.println(a);
			a++;
		}// how to print number from 50 to 1
		//how to print odd numbers from 1 to 20
		
	}

}
