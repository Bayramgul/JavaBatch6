package com.syntax.class21;

public class Parent {
	String name="Farid";
	String lastName="Smith";
	void hello() {
		System.out.println("I am a parent class method");
	}
}
class Child extends Parent{
	String name="Ahmet";
	
	public void display() {
		System.out.println(name);
		System.out.println(super.name);// calls parent class var 
		System.out.println(lastName);
	}
	void sayHello() {
		display();//implicitly compiler add this
		hello();//compiler adds super
		super.hello();
	}
}
