package com.syntax.class34;

public class Task1 {

	public static void main(String[] args) {
		ageEligibility(15);
	}
	public static void ageEligibility(int age ) {
		if(age<16) {
			throw new   RuntimeException("You must be older than 16 to vote"); 
		}else {
			System.out.println("You can vote");
		}
	}
}
