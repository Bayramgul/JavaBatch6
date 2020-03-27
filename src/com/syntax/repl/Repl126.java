package com.syntax.repl;

public class Repl126 {
	static String thirdLetter (String a){
		String b="";
		  for(int i=0; i<a.length();i+=3){
		   b+=a.charAt(i);
		  }
		  
		  return b;
		}

		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}

}
