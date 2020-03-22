package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		//create a String and based on the length of the String
		//we define whether String is short or long
		String str="Hello my friend";
		int length=str.length();
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
		//compare 2 numbers and then we will identify whether largest number is even or odd
		MethodsReturningValue max=new MethodsReturningValue();
		int num=max.largest(23, 67);//storing the largest value that returned from largest method
		System.out.println(num);
		
		boolean odd=max.isOdd(num);//storing the odd number that returned from isOdd method
		System.out.println(" The largest number "+ num + "is odd number: "+ odd);// we have to manuallly print them under main method
	}
	
	// create a method that returns largest number from 2 given numbers
	int largest(int a, int b) {// 1) instead of void write the data type of returning value(largest), this method will return me a value
		int largest=a;//i give the value of a in the main method
		if (a>b) {//condition to find largest
		largest=a;
		}else {
			largest=b;
		}
		return largest;//return must be the last statement inside ur method body, only one return value we can have in one returning method
	}
	
	boolean isOdd (int num) {
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
			
		}else {
			isOdd=true;
		}
		return isOdd;
	}
		
	
	
}
