package com.syntax.class07;

public class Hw3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		// 1stway
		for (int i = 20; i >= 2; i -= 2) {
			System.out.println(i);

		}
		System.out.println("2nd way--------------------");
		int x = 20;
		while (x >= 2) {
			System.out.println(x);
			x -= 2;

		}System.out.println("3rd way---------------------"); 
		int y=20;
		while(y>=2) {
			if(y%2==0) {
				System.out.println(y);
			}
			y-=2;
		}
	}

}
