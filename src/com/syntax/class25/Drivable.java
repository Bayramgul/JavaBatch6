package com.syntax.class25;

public interface Drivable {
	//BY DEFAULT compiler will add public static final for variables
	 boolean MOVE_FAST = true;
	 // BY DEFAULT compiler will add public abstract for methods
	  void drive();
}
abstract class Vehicles{
	abstract void stop();
}
class Car extends Vehicles implements Drivable{

	@Override
	public void drive() {
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");
	}
	
}