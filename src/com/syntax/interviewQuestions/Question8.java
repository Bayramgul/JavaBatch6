package com.syntax.interviewQuestions;

import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
//		 Write a return method that check if a string is build out of the same
//		 letters as another string.
//		 Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
		Question8 obj = new Question8();
		boolean output = obj.check("abc", "cba");
		System.out.println(" Are the words have same letters: " + output);
	}
	boolean check(String str, String str1) {
		boolean check=true;
		char[] c = str.toCharArray();
		char [] c1=str1.toCharArray();
		// alphabetically sort char array
		Arrays.sort(c);
		Arrays.sort(c1);
		String s=""; String s1="";
		// creating new string of sorted letter by for loop
		for( int i=0; i<c.length;i++) {
			s+=c[i];}
		for( int i=0; i<c1.length;i++) {
			s1+=c1[i];}
		if(s.equals(s1)) {// compare two new strings
			return true;
		}else {
			return false;
		}

	}
}
