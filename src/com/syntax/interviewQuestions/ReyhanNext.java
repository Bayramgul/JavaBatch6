package com.syntax.interviewQuestions;

import java.util.Scanner;

public class ReyhanNext {

	public static void main(String[] args) {
		  System.out.println("How many animals do you have?");
		  Scanner scan=new Scanner(System.in);
		    int num= scan.nextInt();//we capture number and just takes one number (one element).and line is open and we can type String
		    //nextInt()leaves empty line 
		    String [] animals= new String [num];
		    scan.nextLine();//whatever remained previous scanner, cleans the previous line and closes it 
		    for (int i=0; i<num; ++i) {
		      System.out.print("Give me an animal name :");//when 
		      animals[i]=scan.nextLine();//
		    }
		    System.out.println("These are anilmals : ");
		    for (String animal : animals) {
		      System.out.print(animal+" ");
		    }
	}
}
