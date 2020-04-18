package com.syntax.repl;

import java.util.LinkedList;

public class Repl184 {

	public static void main(String[] args) {
		/*
		 * Create Linked List that will store first 10 numbers of fibonacci series
		 * Print number from Linked List 1 by 1 all in 1 line
		 * 0 1 1 2 3 5 8 13 21 34 
		 */
		
		LinkedList <Integer> fib=new LinkedList<>();
		fib.add(0, 0);
		fib.add(1, 1);
		int sum=0;
		for(int i=2; i<10;i++) {
			sum=fib.get(i-1)+fib.get(i-2);
			fib.add(sum);
		}
		System.out.println(fib);
	}

}
