package com.syntax.class06;

import java.util.Scanner;

public class HomeworkLogicalOperators {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first numbers below");
		int num1=input.nextInt();
		System.out.println("Please enter second numbers below");
		int num2=input.nextInt();
		int result=0;
		System.out.println("Please choose any operator (+,-,* or /) to calculate the result");
		char operator=input.next().charAt(0);
		switch (operator) {
		case '+':
			result=num1+num2;
			break;
		case'-':result=num1-num2;
		break;
		case '*': result=num1*num2;
		break;
		case'/':result=num1/num2;
		
		}
		System.out.println("Result of "+num1+ operator+num2+" is "+result);
	}

}
