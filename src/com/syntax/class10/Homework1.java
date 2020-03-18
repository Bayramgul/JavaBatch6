package com.syntax.class10;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		 * Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 * following: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		String[][] title = { { "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Jordan", "Jackson", "Obama" } };

		System.out.println(title[0][1] + " " + title[1][0] + ", " + title[0][0] +" " + title[1][3] + ", " + title[0][2] + " "
				+ title[1][2] + ", " + title[0][3]+" "+ title[1][1]);
//		  for (int row = 0; row < title.length; row++) {
//			for (int col = 0; col < title[row].length; col++) {
//				System.out.println(title[row][col]);
//
//			}
//
//		}
	}

}
