package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {

		Car bmw=new BMW("BMW");// referring obj to  parent class
		Car tesla=new Tesla("Tesla");
		Car merc=new Mercedec ("Mercedec");
		Car honda=new Honda("Honda");
		
		Car [] cars={bmw,tesla,merc,honda};// array of objects, objects of parent class
		System.out.println("****Accessing methods through for each loop ****");		
		for(Car c:cars) {// for each loop, Car type of elements
			c.start();// methods based on the obj type will be executed
			c.display();
			System.out.println("------------");
		}
		
		System.out.println("*****Accessing methods through for loop****");
		for(int i=0; i<cars.length;i++) {
			cars[i].start();
			cars[i].display();
			System.out.println("-------");
		}
	}

}
