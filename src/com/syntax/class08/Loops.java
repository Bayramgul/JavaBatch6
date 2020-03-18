package com.syntax.class08;

public class Loops {

	public static void main(String[] args) {
		// write program to calculate sum of odds and sum of even numbers
		// from 1-99
		int sumOdd = 0;
		int sumEven = 0;

		for (int odd = 1; odd <= 99; odd += 2) {
			sumOdd = sumOdd + odd;
		}

		for (int even = 2; even <= 98; even += 2) {
			sumEven = sumEven + even;
		}

		System.out.println(sumEven);
		System.out.println(sumOdd);
		
		System.out.println("2nd way_______________");
		for (int i = 1; i <= 99; i ++) {if(i%2!=0) {
			sumOdd = sumOdd + i;
		}else {
			sumEven = sumEven + i;
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		}
	}

}
