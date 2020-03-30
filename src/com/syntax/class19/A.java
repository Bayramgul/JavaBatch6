package com.syntax.class19;
//Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.

public class A {
	String name;
	int age;
	public void info (String name, int age){
		this.name=name; this.age=age;
		System.out.println(name +" is Bob's daughter and he is "+ age +" years old");
	}
	public static void printF() {
		System.out.println("She loves coding ");
		
	}
}
