package com.syntax.repl;

public class Repl129 {
	//Return a new String built from s that has every instance of the search term surrounded by parentheses
	//See below examples.
	static String surround (String s, String search_term)
	{ 
	String surr=s.replaceAll(search_term, "("+search_term +")");
		
		return surr;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
		
		String a="hello";
		String b=a.replace("e", "(e)");
		System.out.println(b);
	}
}
