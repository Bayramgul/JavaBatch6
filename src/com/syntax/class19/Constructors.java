package com.syntax.class19;

public class Constructors {
	Constructors(){
		this(1);
		System.out.println("Hi");
	}
	Constructors(int x){
		System.out.println("Hello");
	}
	Constructors(int x, int y){
		System.out.println("How are you");
	}
}
