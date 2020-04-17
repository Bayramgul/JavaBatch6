package com.syntax.class23;

public class FinalKeyword {
	public static String str="Hello";
	public static final String STR1="Bye";//Final variable=CONSTANT
	
	final String APPLICATION_URL="https://syntaxtechs.com"; // all your final variables needs to be initialized;
	static final int MONTHOfYear=12;
	
	
	public static void main(String[] args) {
		
		str="Hi";
		//str1="good bye"; CE: cannot be reassigned
		
	}
	public final void hello() {
	System.out.println("I am a final method");
}
	}
class Subclass extends FinalKeyword{
//	public  void hello() {
//		
//	} you can't override final method but you can overload final method;
}