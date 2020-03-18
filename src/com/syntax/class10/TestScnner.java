package com.syntax.class10;

import java.util.Scanner;

public class TestScnner {

	public static void main(String[] args) {
		int num;
        Scanner scan= new Scanner (System.in) ;
        System.out.println("How many animals do you have?");
        num= scan.nextInt();
        System.out.println(num);
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
