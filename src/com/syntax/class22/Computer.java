package com.syntax.class22;
 class SmartMachines{
	 public void smart() {
		 System.out.println("I am a smart machine");
	 }
 }
public class Computer {
public void work() {
	System.out.println("Computer works");
}
public void display() {
	System.out.println("We can watch movies");
}
}
class Apple extends Computer{

	@Override
	public void work() {
		System.out.println("MacBookAir works fast");
	}
	public void look() {
		System.out.println("MAcBooks look pretty");
	}
	
}
class Lenovo extends Computer{

	@Override
	public void display() {
		System.out.println("Lenova computers have touchscreen version ");
	}
	
}
class HP extends Computer{

	@Override
	public void work() {
		System.out.println("HP is popular computer mostly used at workplaces");
	}
	
	
}
class Dell extends Computer{

	@Override
	public void work() {
		System.out.println("Dell has variety of storages ");
	}
	
}