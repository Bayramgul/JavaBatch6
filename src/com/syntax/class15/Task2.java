package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		//Write a method to return whether given number is prime or not?
		Task2 obj=new Task2();
		boolean primeOrNot=obj.primeNum(2);
		System.out.println(" This number is prime: "+ primeOrNot );
		
		
	}
	boolean primeNum(int num) {//boolean return type
		boolean prime=true;
		for (int i=2; i<num;i++) {
			if(num%i==0) {
				prime=false;break;
			}else {
				prime=true;
			}
		}return prime;
	}
}
