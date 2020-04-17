package com.syntax.class27;

public class HW2 {
	// hw create food class that will have 3 undefined methods and it will have 4
	// subclasses; create a collection of food and using 3 ways execute methods

}abstract class Food {
	abstract void cook();

	abstract void bake();

	abstract void makeSalad();
}

class Cake extends Food {

	@Override
	public void cook() {
		System.out.println("Cooking from Cake class");
	}

	@Override
	public void bake() {
		System.out.println("Baking from Cake class");
	}

	@Override
	public void makeSalad() {
		System.out.println("Making Salad from Cake class");
	}
}

class Palaw extends Food {

	@Override
	public void cook() {
		System.out.println("Cooking from Palaw class");
	}

	@Override
	public void bake() {
		System.out.println("Baking from Palaw class");
	}

	@Override
	public void makeSalad() {
		System.out.println("Making Salad from Palaw class");
	}
}

class Olivye extends Food {

	@Override
	public void cook() {
		System.out.println("Cooking from Olivye class");
	}

	@Override
	public void bake() {
		System.out.println("Baking Olivye class");

	}

	@Override
	public void makeSalad() {
		System.out.println("Making Salad from Olivye class");
	}

}

class Manty extends Food {
	@Override
	public void cook() {
		System.out.println("Cooking from Manty class");
	}

	@Override
	public void bake() {
		System.out.println("Baking from Manty class");

	}

	@Override
	public void makeSalad() {
		System.out.println("Making Salad from Manty class");
	}

}