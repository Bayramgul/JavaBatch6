package com.syntax.repl;

public class Repl137 {
	String make, model;
	  int numberOfDoors,topSpeed;
	  double price;
	  Repl137(String make,String model,int numberOfDoors,int topSpeed,double price
	  ){
	    this.make=make;this.model=model;this.numberOfDoors=numberOfDoors; this.topSpeed= topSpeed;this.price=price;
	  }
	  Repl137(String make,String model,int topSpeed,double price){
	    numberOfDoors=4;this.make=make;this.model=model; this.topSpeed= topSpeed;this.price=price;
	  }Repl137(int numberOfDoors,int topSpeed,double price){
	    make="unknown"; model="unknown";this.numberOfDoors=numberOfDoors; this.topSpeed= topSpeed;this.price=price;
	  }
	  Repl137(String make,String model,int numberOfDoors){
	    topSpeed=90;price=0;this.make=make;this.model=model;this.numberOfDoors=numberOfDoors;
	  }
	  void diplay(){
	    System.out.println(make+" " + model+" "+ numberOfDoors+ " " +topSpeed+" "+price );
	  }

}
