package com.syntax.repl;

public class Repl142 {
	String item;
	  double price;
	  int quantity;
	 Repl142 (String item, double price,int quantity){
	    this.item=item;this.price=price;this.quantity=quantity;
	  }
	  double itemTotalPrice(){
	    double totalValue=this.quantity*this.price;
	    return totalValue;
	  }

}
