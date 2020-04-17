package com.syntax.groupwork;

public class CarTest {

	public static void main(String[] args) {
		Car truck=new Truck(50000, "white",2000 );
		Car sedan=new Sedan(15000, "black", 10);
		double p1=truck.calculateSalePrice();
		double p2=sedan.calculateSalePrice();
		System.out.println("The current price of "+ truck.color+ " truck is : "+p1 );
		System.out.println("The current price of "+ sedan.color+ " sedan is : "+p2 );

	}

}
