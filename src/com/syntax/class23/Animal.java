package com.syntax.class23;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Bird extends Animal{// this is method hiding
	public static void whoAmI() {// static can't be overridden
		System.out.println("I am a bird");
	}
	public void sleep() {// static can't be overridden
		System.out.println("Bird sleeps");
	}
}