package com.syntax.class18;

public class ConstructorInfo {
	ConstructorInfo (){
		System.out.println("I am a constructor");
	}
	ConstructorInfo(String greeting){
		System.out.println("How are you");
	}

	public static void main(String[] args) {
		ConstructorInfo obj=new ConstructorInfo();
		new ConstructorInfo();// just call it this way it will find by matching ()parameters
		new ConstructorInfo("Welcome");// finds constructor by String parameters
	}

}
