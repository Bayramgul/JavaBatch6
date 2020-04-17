package com.syntax.repl;

import java.util.Arrays;

public class R133 {
	/*
	 * Return a string that is composed of each letter as long as the letter is
	 * later on in the alphabet than its previous one. You can assume actual
	 * parameters are lowercase. See below examples.
	 * 
	 * Additional Info: You can use < and > to compare characters (not Strings),
	 * where characters later on in the alphabet are "greater". 
	 * Examples: 'a' < 'b' ==> True 'a' < 'a' ==> False 'a' > 'b' ==> False*/
	public static void main(String[] args) {
		String str1="";
		String str="software";
		char[] c=str.toCharArray();
		  char large=c[0];
		//Arrays.sort(c);
		for (int i=1;i<c.length;i++) {
			if(c[i-1]<c[i]&& c[i-1]!=c[i]) {
				large=c[i];
		}else if(c[i-1]> c[i]&&c[i-1]!=c[i]){
			large=c[i-1];//h
		}
			str1+=large;
		}
		
//		for(int j=0;j<str1.length();j++) {
//			char cr=str1.charAt(j);
//			if(str1.indexOf(cr)<0) {
//				str2+=cr;
//			}
		//}
		
		
		System.out.println(str1);
		
		//hlo  hello
		//stwr  software
		//lnug language

}
	}


