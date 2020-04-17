package com.syntax.class24;

public abstract class Vehicle {
	String color;
	static int totalVehicles;
	
	Vehicle (String color){
		this.color=color;
		totalVehicles++;//increment total num every time obj used, thi is num of objs
	}
	public static void total() {
		System.out.println("We build: "+totalVehicles+ " vehicles");
	}
	
	public void drive() {
		System.out.println("Vehicle drives");
	}

	public void stop() {
		System.out.println("Vehicle stops");
	}
	public abstract void start();
	public abstract void brake();
	// can abstract method be static ? no
	// can abstract method be final? no 
	// can abstract method be private? no
}
abstract class Car extends Vehicle{
   String carType;
	Car(String color,String carType) {
		super(color);
		this.carType=carType;
		
	}

	@Override
	public void brake() {
		System.out.println(carType+" have brakes");
	}
	
}
class Tesla extends Car{
String make;
	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
		
	}

	@Override
	public void start() {
		System.out.println(make+ " starts remotely");
	}
	
}
class Toyota extends Car{
	String make;
	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void start() {
		System.out.println(make+ "is qualified car ");
	}
	public void display() {
		System.out.println("We have "+color+" "+carType);
	}
	
}
class Bus extends Vehicle{

	Bus(String color) {
		super(color);
	}

	@Override
	public void start() {
		System.out.println("Bus starts working with key");
	}

	@Override
	public void brake() {
		System.out.println("Bus stops with break");
	}
	
}
class SchoolBus extends Bus {

	SchoolBus(String color) {
		super(color);
	}

	@Override
	public void drive() {
		super.drive();
		System.out.println("School buses carry school Students");
	}

	@Override
	public void stop() {
		super.stop();
		System.out.println("All cars stops when school bus raises stop sign");
	}
	
}