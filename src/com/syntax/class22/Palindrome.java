package com.syntax.class22;

public class Palindrome {
	Palindrome(){
		System.out.println("Answer to Q2");
	}
	public static boolean number(String name) {
		boolean letters=true;
		name=name.replaceAll("[^A-Za-z]","").toLowerCase();
	String flag="";
	for (int i=name.length()-1;i>=0;i--) {
			flag=flag+name.charAt(i);}
		if(flag.equalsIgnoreCase(name)) {
		return true;}
		else {
		return false;}
	}
	public static void main(String[] args) {
		Palindrome result=new Palindrome();
		Boolean endResult=Palindrome.number("Was It A Rat I Saw?");
		System.out.println(endResult);


}
}
