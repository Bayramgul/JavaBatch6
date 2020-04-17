package com.syntax.repl;

public class Animal {

	String animal, food;

	Animal(String animal) {
		this.animal = animal;
	}

	public void eat() {
		System.out.println(animal + " eats");
	}

	public void sleep() {
		System.out.println(animal + " sleeps");
	}

	
}

class Cat extends Animal {
	Cat(String animal) {
		super(animal);
	}

	@Override
	public void sleep() {
		System.out.println(animal + " sleeps");
	}

}

class Kitten1 extends Cat {
	Kitten1(String animal) {
		super(animal);//,String food
		//this.food=food;
	}
	

//	public void eat() {
//		System.out.println(animal + " eats milk" );
//	}

}

class Kitten2 extends Cat {
	Kitten2(String animal) {
		super(animal);//, String food
		this.food=food;
	}

	public void eat() {
		System.out.println(animal + " eats snacks");
	}

}

class Kitten3 extends Cat {
	Kitten3(String animal) {
		super(animal);//,String food
		this.food=food;
	}
	public void eat() {
		System.out.println(animal + " eats everything");
	}
}
