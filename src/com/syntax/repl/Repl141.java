package com.syntax.repl;

public class Repl141 {
	
	String model;
	  double price;
	  int quantity;
	  Repl141(){
	    this.model=model;this.price=price; this.quantity=quantity;
	  }
	  void carStockValue(){
	    double totalValue=this.quantity*this.price;// quantity and price are not local, they are instance variables so we need to call them by this
	    System.out.println(model+ " Stock Value "+ totalValue);
	  }

	public static void main(String[] args) {
		Repl141 obj=new Repl141();
		obj.model="Toyota 2019";
	    obj.quantity=100;
	    obj.price=25000;
	}

}
