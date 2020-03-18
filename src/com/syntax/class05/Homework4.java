package com.syntax.class05;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		/*
		 * Program to find largest number among three numbers using nested if provided
		 * by a user (numbers must be distinct)
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter three numbers below:");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int largest = 0;
		
		if (n1 > n2) {
			if (n1 > n3) {
				largest = n1;
			}
		} else if (n2 > n3) {
			if (n2 > n1) {
				largest = n2;
			}
		} else if (n3 > n1) {
			if (n3 > n2) {
				largest = n3;
			}

		}System.out.println("The largest number is "+ largest);

	}

}
