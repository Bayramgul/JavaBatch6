package com.syntax.class18;

public class BestCar {
	String make,model,color;
	int year,door,wheels;
	
	public void printDetails() {
		System.out.println("I have "+ year+ " "+make+" "+ model+" in "+ color);
		System.out.println(make +" has "+door+"doors and "+ wheels+ " wheels");
	}
	BestCar(String carMake,String carmodel,String carcolor,int carYear,int carDoor,int carWheels){
		make=carMake;model=carmodel;color=carcolor;make="Toyota";
		year=carYear;door=carDoor;wheels=carWheels;
		System.out.println(" I am constructing best car "+make+" "+" "+carmodel+" "+carcolor+" "+carYear+" "+carDoor+" doors");
	}
	public static void main(String[] args) {
		//BestCar car=new BestCar();// once you crate own constructor compiler will not create default constructor or will not give default value
		BestCar car	=new BestCar("BMW", "m5", "grey",2020, 4,5);// 1st constructor code will execute
		car.make="BMW";
		car.printDetails();// 2nd will execute all codes inside of printDetails method
	}

}
