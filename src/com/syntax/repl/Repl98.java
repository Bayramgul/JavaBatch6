package com.syntax.repl;

import java.util.Scanner;

public class Repl98 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    String w="";
	   for(int i=0;i<word.length()-1;i+=2){
	     w+=word.charAt(i);
	     System.out.println(w);
	   }System.out.print(w);
	    
	}

}
