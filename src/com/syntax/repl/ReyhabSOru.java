package com.syntax.repl;

import java.util.Scanner;

public class ReyhabSOru {

	public static void main(String[] args) {
		
	        
	         
	         Scanner scan= new Scanner (System.in) ;
	         System.out.println("How many animals do you have?");
	         int num= scan.nextInt();
	         
	         String [] animals= new String [num];
	         
	        
	         for (int i=0; i<num; i++) {
	             System.out.print("Give me an animal name :");
	             animals[i]=scan.nextLine(); 
	             
	             
	         }
	         
	         System.out.println("These are anilmals : ");
	         for (String animal : animals) {
	             System.out.print(animal+" ");
	             
	         }
	         
	        
	        

	}

}
