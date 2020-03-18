package com.syntax.class09;

public class PatternWithArrays {

	public static void main(String[] args) {
		String stars[][]= {{"*","*","*","*","*","*"},
				           {"*","*","*","*","*","*"},
				           {"*","*","*","*","*","*"},
				           {"*","*","*","*","*","*"}, 
				           {"*","*","*","*","*","*"}, 
				            {"*","*","*","*","*","*"}};
		for (int row=0;row<5;row++) {
			for(int col=0;col<stars.length;col++) {// column never should exceed the num of rows
				System.out.print(stars[row][col]);
			}System.out.println();
		}
		
	}

}
