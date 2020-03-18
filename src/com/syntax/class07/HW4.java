package com.syntax.class07;

public class HW4 {

	public static void main(String[] args) {
		//Print odd numbers between 20 and 50 (2 ways)
		
		for (int i=21; i<50;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("2nd ----------------------");
		int x=21;
		while (x<50) {
			System.out.println(x);
			x+=2;
		}
		System.out.println("3rd ----------------------");
		int y=21;
		while (y<50) {
			if (y%2!=0) {
				System.out.println(y);
				y+=2;
			}
		}
	}
	

}
