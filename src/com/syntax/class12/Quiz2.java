package com.syntax.class12;

public class Quiz2 {

	public static void main(String[] args) {
		// question 3--->  10 100 50
		int i = 50;

		int[] a = new int[10];
		System.out.println(a.length);

		a = new int[100];
		System.out.println(a.length);

		a = new int[i];
		System.out.println(a.length);
		//question 4--> sum=4
		int[] a1 = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i1 = 0; i1 <a1.length; i1++) {
		         if (a1[i1] % 2== a2[i1 ] % 5)  {
		                  sum += i1 * i1;
		         }
		}
		System.out.println("sum = " + sum);
		//question 5- 2d array
		//question 6- 2 4 6 8 10
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ ) {
		       System.out.print( egArray[ index ] + " " );
		}
		//question 7
		// d: int arr[]= int[5]new
		
		// question 8--->iiiiiiiiii(10 times)
		
		
		}
		

}
