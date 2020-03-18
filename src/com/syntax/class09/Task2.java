package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		for(int row=1;row<=5;row++) {
			for(int col=0;col<row;col++) {
				System.out.print("*");}
			System.out.println();
			}
			
		for(int r=5; r>=1;r--) {
			for(int c=1;c<r;c++) {
				System.out.print("*");
			}System.out.println();
		}
}
		
	}

