package com.syntax.class09;

public class Task1NestedLoops {

	public static void main(String[] args) {
		/*
		 * Print the following pattern:
55555
4444
333
22
1  
		 */
		for(int row=5;row>=1;row--) {
			for(int col=0;col<row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
		
		
	}

}
