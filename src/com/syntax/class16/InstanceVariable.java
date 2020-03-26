package com.syntax.class16;

public class InstanceVariable {
//Instance variable is inside of class but outside of class, to reach that variable u need to create instance(object) of that class==object
	//whem we create different instances of a class, they wont effect each other
	public static void main(String[] args) {
		String name="Yunus";
	//how to access instance variable ?--> by creating object and using reference a variable
		System.out.println(InstanceVariable.breed);// shared with all instances
		System.out.println(breed);// we are in same class now
	}

void displayDog() {
	System.out.println();
}
//static variable is inside the class but outside of any method, constructor or block using static keyword 
	//why need static variable:using static keyword we can define common features(applicable for all objects)
	static String breed="Husky";
	static int tail=1;
	static int eyes=2;
	// how to access ststaic variable --> static variable belong to the class-->accessed by class name
	
}
