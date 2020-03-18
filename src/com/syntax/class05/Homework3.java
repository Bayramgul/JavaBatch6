package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */
		
		// 1.declare 3 double variables for user input
		// declare comparison variable as greatest and initialize it by assigning a
		// value, it will be updated according to the conditions
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 3 double values");
		double v1 = s.nextDouble();
		double v2 = s.nextDouble();
		double v3 = s.nextDouble();
		double greatest = 0;
		if (v1 > v2 && v1 > v3) {
			greatest = v1;
		} else if (v2 > v1 && v2 > v3) {
			greatest = v2;
		} else if (v3 > v1 && v3 > v2) {
			greatest = v3;
		}
		System.out.println("The greatest value is " + greatest);
	}

}
