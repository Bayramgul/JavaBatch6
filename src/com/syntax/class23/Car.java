package com.syntax.class23;

public class Car {
	String make;
	public Car(String make) {
		this.make=make;
	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	public void display() {
		System.out.println("I have "+make);
	}
	public void start() {
		System.out.println(make+" starts by turning key");
	}
	
}
class BMW extends Car{
	BMW(String make){
		super(make);
	}

	@Override
	public void start() {
		System.out.println(make+" starts by pushing start button");
	}
}class Mercedec extends Car{
	Mercedec(String make){//call parameterized constructor
		super(make);
	}

	@Override
	public void start() {
		System.out.println(make+ " starts remotely");
	}
	
}class Tesla extends Car{
	Tesla(String make){
		super(make);
	}

	@Override
	public void start() {
		System.out.println(make+ " starts by voice command");
	}
	
}class Honda extends Car{
	Honda(String make){//call paramterized constructor
		super(make);
	}
}