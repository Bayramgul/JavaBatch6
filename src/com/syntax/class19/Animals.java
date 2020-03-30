package com.syntax.class19;
// by default Animal class will have Object class as a parent
public class Animals extends Object {//every class will have superclass
	public String fur, size, color;
	public static int age;
	public static void display() {
		System.out.println("Animal age is "+ age);
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}
	public void eat() {
		System.out.println("All animals eat");
	}
	public void beWild() {
		System.out.println("All animals can be wild");
	}
}
