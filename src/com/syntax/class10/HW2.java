package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that first row will contain 4 names and second row will
		 * contain grades. Then your program should print name of the students that has A
		 * and B grade
		 */
		String nameGrad[][]= {{"Anna","Maryam","Nil","John"},
				             { "A","B","C","D"}};
		String all=null;
		for (int row=0;row<nameGrad.length;row++) {
			for (int col=0;col<nameGrad[row].length;col++) {
				all=nameGrad[row][col];
				switch (all) {
				case "Anna":System.out.println("Anna got an A");break;
				case"John":System.out.println("John got B");break;
				}
			}
		}
		
	}

}
