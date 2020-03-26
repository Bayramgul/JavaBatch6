package com.syntax.repl;

public class Repl125 {

	static  String mixString(String s1, String s2){
		String mix="";
		  // 1st way
		for(int a=0;a<s1.length();a++) {
			mix=mix+s1.charAt(a)+s2.charAt(a);
		}
		  //2nd way
		 String [] stw =s1.split("");
		 String [] st=s2.split("");
		  for(int i=0;i<stw.length;i++){
		    mix+=stw[i]+st[i];
		      
		  } return mix;
		}
		//test case below (don't change):
		public static void main(String[] args){
		  String firstValue = mixString("12345","abcde"); 
		System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
			
			  
			  
}}
