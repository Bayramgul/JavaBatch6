package com.syntax.class12;

public class Recap {

	public static void main(String[] args) {
		String str="";//empty value
		System.out.println(str.isEmpty());
		
		String str1=null;//novalue at all
		// System.out.println(str1.isEmpty());RunTime error--> NullPointerException
		String str2="  Good Morning  ";
		String str3=" students";
		String str4=" !";
		
		str2=str2.trim().concat(str3).concat(str4);
		System.out.println(str2);
		String str5="Day";
		int date=25;
		//str5.concat(date); 
		
		
		String str6=" Hello ";
		String str7="Syntax";
		str6=str6.concat(str7).trim();
		System.out.println(str6);
		
		//if i first trim firstthen it will print without space btw strings
		
		//str6=str6.trim().concat(str7);
		//System.out.println(str6);
		
		
	}

}
