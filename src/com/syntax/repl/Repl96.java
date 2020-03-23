package com.syntax.repl;

import java.util.Scanner;

public class Repl96 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    char[] array=s.toCharArray();
	    String reverse="";
	    for(int i=array.length-1;i>=0;i--){
	    reverse+=array[i];
	    }
	      System.out.println(reverse);
	}

}
