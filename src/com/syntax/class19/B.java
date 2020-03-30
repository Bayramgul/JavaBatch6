package com.syntax.class19;

public class B extends A {
	public void play() {
		System.out.println(name+ " also can play piano");// i can access instance variable of class A
	}
	public static void main(String[] args) {
		A.printF();
		
	}
}
