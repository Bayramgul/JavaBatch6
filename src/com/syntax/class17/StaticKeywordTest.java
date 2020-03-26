package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		StaticKeyword obj = new StaticKeyword();
		// to access instance members i need to create an obj
		obj.color = "red";// assign value by instance of that class, no need to write the name of the
							// class anymore
		obj.memory = 128;
		obj.displaySpecification();// instance method called by instance
		// access static variables of the other class, i dont need an obj
		// just call them by classname. static variable name
		StaticKeyword.brand = "Android";// brand will change all variables
		StaticKeyword.touchScreen = true;
		StaticKeyword.displayGeneralInfo();
		//DISADVANTAGES
		// static members cannot access non static members
		
		
	}

}
