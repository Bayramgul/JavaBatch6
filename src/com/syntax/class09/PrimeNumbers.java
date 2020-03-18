package com.syntax.class09;

public class PrimeNumbers {

	public static void main(String[] args) {
	int i=2;
		int num = 1;
		while (num < 100) {// gives me the range i need
			num++;
			if (i == 2 && i < 10) {// any one digit number
				if (num % i == 0) {
					continue;
				}
				System.out.println("These are prime numbers: " + num);
			}
		}
//		for(int number)
//		int number[]= {};

	}

}
