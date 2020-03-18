package com.syntax.class09;

public class Mileage {
	//print audometer range from 00000 to 9999
	public static void main(String[] args) {
		for (int outer1=0;outer1<=9;outer1++) {
			for(int inner1=0;inner1<=9;inner1++) {
				for(int inner2=0;inner2<=9;inner2++) {
					for(int in3=0;in3<=9;in3++) {
						System.out.println(outer1+""+inner1+""+inner2+""+in3);
					}
				}
			}
		}
		
	}

}
