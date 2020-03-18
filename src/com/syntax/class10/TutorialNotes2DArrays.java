package com.syntax.class10;

public class TutorialNotes2DArrays {

	public static void main(String[] args) {
		int grades[][] = { { 2, 3, 6 }, { 2, 3, 34 }, { 34, 56, 34 }, { 1, 89, 67 } };
//logic is grades.length ===> will tell me how many rows i have, i can add and delete any rows anytime
		System.out.println(grades.length);
//grades[0].length ===> will tell me how many elements 0 row holds; i can choose which row i want by changing the index number
		System.out.println(grades[1].length);
// **** IMPORTANT:we always use grades.length and grades[0].length as an ending point of our conditions.
		for (int row = 0; row < grades.length; row++) {// outer for loop condition always for rows
			for (int column = 0; column < grades[row].length; column++) {// inner for loop condition is always for
																			// columns
				System.out.print(grades[row][column] + " ");// *** this code tell the address of each individual element
															// and print the value
				// ***code must be inside of inner loop;
			}
			System.out.println();// this code will create empty line and must be located outside of inner loop
		}
	}

}
