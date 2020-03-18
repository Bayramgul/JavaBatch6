package com.syntax.class11;

public class StringComparison {

	public static void main(String[] args) {
		String str1="Hello";
		boolean check=str1.endsWith("o");
		System.out.println(check);
		String str2=new String("Hello");
		String str3=new String("Hello");
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		
		
		if(str1 ==(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
	   if(str3 ==(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
	}

}
