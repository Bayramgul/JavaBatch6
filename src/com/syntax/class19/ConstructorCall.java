package com.syntax.class19;

public class ConstructorCall {
	public ConstructorCall() {
		
		System.out.println(" I am non argument constructor");
		
	}
	public ConstructorCall(String str) {
		this(); // calls non argument constructor 
		System.out.println("I am constructor with one parameter");
		//this(); constructor call must be first in order inside the constructor
	}
	public ConstructorCall(String str, String str1) {
		this("Hello");// call constructor string as a parameter
		//this(str); either call by variable name or by value of that variable inside constructor parameters
	}
	
	public static void main(String[] args) {
		// creating an Object bypassing 2 String values
		ConstructorCall obj=new ConstructorCall("Java", "Love");
	}
}
