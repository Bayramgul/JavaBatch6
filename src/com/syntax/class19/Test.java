package com.syntax.class19;

public class Test {

	public static void main(String[] args) {
		Dog dog=new Dog();
		// access variables from own class
		dog.breed="Husky";
		// access variables from parent class
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Big";
		
		//access method from own class
		dog.bark();
		// access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		// access to static variable and methods in a static way
		Dog.age=12;
		Dog.display();
		Animals animal=new Animals();
		animal.color="Any";
		animal.fur="Any";
		animal.size="Any";
	}

}
