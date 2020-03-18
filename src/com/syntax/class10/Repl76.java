package com.syntax.class10;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		
		String day[]=new String[7];//number of elements;
		
		for(int row=0;row<day.length; row++){
		       //									  0
	        System.out.println("Please enter day "+ (row+1)+" of the week");
	   
	    day[row] = scan.next();
	    //day[0]=sunday;
	    //day[1]=mon;
	       }
	       //for(start point; end point. increment/decrement
		for(int i=day.length-1;i>=0;i--) {
			System.out.println(day[i]);
	     
	    
	     }
	   
	    
	    
	  
		   
	}
}
