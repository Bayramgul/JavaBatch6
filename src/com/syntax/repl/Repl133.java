package com.syntax.repl;

import java.util.Arrays;

public class Repl133 {
	/*
	 * Create a method that will be available to all classes in your project with
	 * following specifications:
	 * 
	 * Returns: a String Name: alphabetical Parameters: a String called str Purpose:
	 * Return a string that is composed of each letter as long as the letter is
	 * later on in the alphabet than its previous one. You can assume actual
	 * parameters are lowercase. See below examples.
	 * 
	 * Additional Info: You can use < and > to compare characters (not Strings),
	 * where characters later on in the alphabet are "greater". Examples: 'a' < 'b'
	 * ==> True 'a' < 'a' ==> False 'a' > 'b' ==> False
	 * 
	 * Examples: alphabetical("hello") ==> "hlo" alphabetical("software") ==> "stwr"
	 * alphabetical("language") ==> "lnug"
	 * 
	 */
	

	public String alphabetical(String str) {
		char[] c = str.toCharArray();
		      //Arrays.sort(c);
			    String s = "" + c[0];
			    for (int i = 1; i < c.length; i++){
			      if (c[i-1] < c [i]){
			        s += c[i];
			      }
			    }
			    return s;
			  }
				// teacher's solution
//	char previous = str.charAt(0);
//	char current;
//	String newString = "" + previous;
//
//	for (int i = 1; i < str.length(); i++) {
//		current = str.charAt(i);
//		if (current > previous) {
//			newString += str.charAt(i);
//		}
//		previous = current;
//	}
//	return newString;
//}
//			
//  
	

	public static void main(String[] args) {
		Repl133 obj = new Repl133();
		System.out.println(obj.alphabetical("hello"));//hlo
		System.out.println(obj.alphabetical("software") );//==> "stwr"
		System.out.println(obj.alphabetical("language"));// ==> "lnug"
		
		String st="apple";//string 
		char[] rev=st.toCharArray();//return to character array
		Arrays.sort(rev);// sort characters alphabetically in a char array 
		String text="";// new String  
		for(int j=0;j<rev.length;j++) {
			text+=rev[j];
		}
		String text1="aelpp";
		System.out.println(text.equals(text));

	}
}
