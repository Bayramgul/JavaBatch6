package com.syntax.class20;

public class Car {
	String make,model;
	Car() {
		System.out.println("I am parent class construvtor");
	}
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
	}

}
class Mercedes extends Car{
	String sportModel;
	public Mercedes() //by default compiler adds super() to call constructro of parent class to initialize 
	{
		System.out.println("I am Child class Constructor");
		
	}
	public Mercedes(String make, String model,String sportModel ) {// to initialize instance var of own class
		
		super(make,model);// and pass parent class's instance vars into parameters, and initialize them to use in my method
		this.sportModel=sportModel;
	}
	public void display() {
		System.out.println(" I have "+make+" "+model+" "+sportModel);
	}
}
