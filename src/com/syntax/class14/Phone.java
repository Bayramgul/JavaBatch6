package com.syntax.class14;

public class Phone {
	
	String color;
	String model;
	int storage;
	void ring(){
		System.out.println(color +" " +model + " is ringing loudly");
	}
	void fast() {
		System.out.println(color+" "+model + " works so fast");
	}
 void slow(){
	System.out.println(color + " "+ model+ "works so slowly");
}
	public static void main(String[] args) {
		// Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
		// specific  attributes and behaviors.
		
		Phone p1=new Phone();
		p1.color="White";
		p1.model="iPhone";
		p1.storage=125;
		p1.ring();
		p1.fast();
		
		Phone p2=new Phone();
		p2.color="Black";
		p2.model="Android";
		p2.storage=250;
		p2.ring();
		p2.fast();
		
		Phone p3=new Phone();
		
		p3.color="Red";
		p3.model="Nokia";
		p3.storage=300;
		p3.ring();
		p3.slow();
	}

}
