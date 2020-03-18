package com.syntax.class12;

public class StringManipultionsMore {

	public static void main(String[] args) {
		String str="Today is a rainy day";
		String partialString=str.substring(6);
		System.out.println(partialString);
		//rainy day
		partialString=str.substring(11);
		
		//Today
		partialString=str.substring(0,5);//start from 0, end at index
		
		//rainy
		partialString=str.substring(11,16);
		
	}

}
