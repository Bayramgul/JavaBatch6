package com.syntax.repl;

import java.util.LinkedList;

public class Repl186 {
//Create an Linked List that will store all prime numbers from 1 to 100
//Step 1. Create a method that will identify whether number is prime or not
//Step 2. Add all prime numbers into Linked List
//Print Linked List:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, ...
	public static boolean checkPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		LinkedList<Integer> prime = new LinkedList<>();
		
		for(int i=2;i<100;i++) {
			if(checkPrime(i)) {
			prime.add(i);
			}
		}
		System.out.println(prime);
	}

}
