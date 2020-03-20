package Repl;

import java.util.Scanner;

public class Repl97 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	   	String rev="";
	   	givenString=givenString.replace(" ","");
	   for(int i=givenString.length()-1;i>=0;i--){
	     rev+=givenString.charAt(i);
	   }
	   //System.out.println("This is reverse "+rev);
	   	if (givenString.equalsIgnoreCase(rev)){
	   	  System.out.println("true");
	   	}else {
	   	  System.out.println("false");}

	   	
	   	 
}}
