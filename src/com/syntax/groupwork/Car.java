 package com.syntax.groupwork;

public abstract class Car {
	/*
	 * Create a Class Car that would have the following fields: carPrice and color
	 * and method calculateSalePrice() which should be returning a price of the car.
	 * Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
	 * and has its own implementation of calculateSalePrice() method in which
	 * returned price calculated as following: if weight>2000 then returned price
	 * car should include 10% discount, otherwise 20% discount.
	 * 
	 * 
	 */

	double carPrice;
	String color;

	Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	abstract double calculateSalePrice();

}

class Truck extends Car {
	int weight;

	Truck(double carPrice, String color, int weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	@Override
	double calculateSalePrice() {
		if (weight > 2000) {
			carPrice = carPrice - (carPrice * 0.1);
		} else {
			carPrice = carPrice - (carPrice * 0.2);
		}
		return carPrice;
	}

}// The Sedan class has field as length and also does it is own implementation of
//* calculateSalePrice(): if length of sedan is >20 feet then returned car price
//* should include 5% discount, otherwise 10% discount

class Sedan extends Car {
	double length;
	Sedan(double carPrice, String color,double length) {
		super(carPrice, color);
		this.length=length;
	}

	@Override
	double calculateSalePrice() {
		if(length>20) {
			carPrice = carPrice - (carPrice * 0.05);
		}else {
			carPrice = carPrice - (carPrice * 0.10);
		}
		return carPrice;
	}

}