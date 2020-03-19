package com.syntax.class11;

public class StringMethods {

	public static void main(String[] args) {
		// String methods do some particular task to a code
		
		String name="Bob Joe Bill";
		
		System.out.println(name);
		System.out.println(name.length());//tells the num of characters in the name variable
		System.out.println(name.toUpperCase());//returns all of the values to Upper case
		System.out.println(name.toLowerCase());//returns all characters to lower case
		System.out.println(name.charAt(9));//tells the character at that index number
		System.out.println("Certain substring "+name.substring(0,3));//cuts chrcters btw certain indexes including 0 and 3(cuts and throws after3)
		System.out.println(name.indexOf("bah"));// when u write anything thats  not in your name var it will print -1
		//************String Concatenation************
		String day="Saturday";
		String date="14";
		String newDate=day.concat(date);// only works for concatenating STRINGS not other data types
		System.out.println(newDate);
		
		// *********Is Empty method/function**********
		// tells true if there is no characters inside the String
		//tells false if there is any characters inside the String
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		//******* trim() FUNCTION******
		//removes empty/white spaces at the beginning and end of the String
		String str4="    Welcome to Syntax!    ";
		str4=str4.trim();
		System.out.println("String with non leading or trainling spaces:"+str4);

	}

}
