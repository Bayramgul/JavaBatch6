package com.syntax.class24;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle tesla=new Tesla("yellow", "sedan","tesla");
//		tesla.brake();
//		tesla.drive();
//		tesla.start();
//		tesla.stop();
	Vehicle toyota =new Toyota("white","Camry","Toyota ");
	Vehicle bus=new Bus("red");
	Vehicle schoolbus=new SchoolBus("yellow");
	Vehicle[]vehicles= {toyota,tesla,bus,schoolbus};
	
	for(int i=0;i<vehicles.length;i++) {
		vehicles[i].total();
		vehicles[i].brake();
		vehicles[i].drive();
		vehicles[i].start();
		vehicles[i].stop();
		System.out.println("*******");
		
	}
	
		
		
	}

}
