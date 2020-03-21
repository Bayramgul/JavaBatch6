package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		//build individual objects
		 Car car1=new Car();//obj is instance of a class
		  car1.make="lambourghini";
			car1.model="gallardo";
			car1.year=2020;
			car1.color="Blue";
			
			 Car car2=new Car();
			  car2.make="BMW";
				car2.model="m5";
				car2.year=2019;
				car2.color="pink";
				car2.bark();
				
				Car car3=new Car();
				car3.make="123";
				car3.speed=200;
				System.out.println("I drive "+car2.make);
				System.out.println(car2.make);
				car1.makeNoise();
				car1.accelerate();
				car1.drive();
				car2.stop();
				car3.accelerate();
	}

}
