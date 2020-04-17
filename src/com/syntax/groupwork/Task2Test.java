package com.syntax.groupwork;

public class Task2Test {

	public static void main(String[] args) {

		Marks s1 = new StudentA(80, 95, 70);
		Marks s2 = new StudentB(89, 100, 95, 90);
		double ave1 = s1.getPercentage();
		double ave2 = s2.getPercentage();
		System.out.println("Average grade for 3 subjects of Student A is: " + ave1);
		System.out.println("Average grade for 4 subjects of Student B is: " + ave2);

	}

}
