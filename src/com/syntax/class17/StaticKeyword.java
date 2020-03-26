package com.syntax.class17;

public class StaticKeyword {
	//create a template for a phone
	String color;//instance variable
	int memory;
	static String brand;//static variable
	static boolean touchScreen;
	//return type, name, parameters
	static void displayGeneralInfo() {
		System.out.println("We are building "+ brand+ " with touch screen="+touchScreen);
	}
	void displaySpecification() {
		System.out.println("We build phone with memory "+memory+"in " +color+" color");
	}
	public static void main(String[] args) {
		StaticKeyword phone=new StaticKeyword();
		phone.color="White";// to access instance variable by creating an object
		phone.memory=123;// object reference variable 
		
		brand="Iphone";//just call it by var name, if its 0utside of class call it by classname.variable name
		touchScreen=true;// static variable called by its class name
		
		
		// Accessing static method in static way
		displayGeneralInfo();
		// Accessing static method in non static way
		phone.displayGeneralInfo();//valid bit not preferable;
	
		 // Accessing instance method through objname.classname
		phone.displaySpecification();
		
		
	}
}
