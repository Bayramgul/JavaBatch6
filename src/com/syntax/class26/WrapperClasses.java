package com.syntax.class26;

public class WrapperClasses {
	public static void main(String[] args) {
		//auto boxing
		Integer num=10;//num is object of Integer class, num is non primitive type 
		String s=num.toString();
		System.out.println(s);
		System.out.println(num.MIN_VALUE);
		//auto boxing
		Byte b=90;
		String s1=b.toString();
		System.out.println(s1);
		System.out.println(b.MAX_VALUE);
		System.out.println(b.MIN_VALUE);
		
		Boolean bool=true;
		//auto unboxing 
		boolean b1=bool;
		
		
	}

}
