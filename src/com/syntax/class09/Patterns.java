package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		for(int a=0; a<=5;a++) {
			System.out.print("*");
		}
		// i want to print 4 rows and 5 columns star pattern
		for (int i=1;i<=4;i++) {// outer loop for row
			for (int j=1;j<=4;j++) {//inner loop for column
				System.out.print("*");
				
			}
			System.out.println();//create empty line outside of inner loop 
		}
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		// 5X10
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
