package com.syntax.class20;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();// call for parent class constructor
		System.out.println("--------------");
		Mercedes mer=new Mercedes();
		mer.display();
		Mercedes mer1=new Mercedes("Mercedes","M","No AMG");
		mer1.display();
		
	}

}
