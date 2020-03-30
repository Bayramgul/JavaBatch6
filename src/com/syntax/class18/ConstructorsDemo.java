package com.syntax.class18;

public class ConstructorsDemo {
	ConstructorsDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	ConstructorsDemo(String str){
		System.out.println("I am a constructor with 1 string paramter "+str);
	}ConstructorsDemo(String str, int num){
		System.out.println("I am a constructor with 2  paramter "+ str+ " & "+num);
	}
	public static void main(String[] args) {
		ConstructorsDemo obj=new ConstructorsDemo();// non argument constructors
		new ConstructorsDemo("yes",3);// this is call for the constructor
		ConstructorsDemo obj1=new ConstructorsDemo("Today is Java Class");
		
	}
}
