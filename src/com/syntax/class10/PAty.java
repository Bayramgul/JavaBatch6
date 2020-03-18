package com.syntax.class10;

public class PAty {

	public static void main(String[] args) {
		//      1*****	
		//      12****
		 //		123***
		// 		1234**
		// 		12345*
		 //		123456
		
		for (int row=1; row<=6;row++) {//will give me num of rows
			for(int col=1; col<=row;col++) {
				System.out.print(col);
			
				
			}
			for(int i=6;i>row;i--) {
				System.out.print("*");
				
				
		}
		
			System.out.println();
	}
		
	}}
