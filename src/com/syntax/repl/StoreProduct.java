package com.syntax.repl;

public class StoreProduct {
	String label,category;
	  double price;
	  boolean hasExpiration;
	  int stock;
	  StoreProduct(String label,double price,String category,boolean hasExpiration,int stock){
	   this.label=label;this.price=price;this.category=category;this.hasExpiration=true;this.stock=stock;
	  }StoreProduct(String label,double price,int stock){
	    this.label=label;this.price=price;category="misc";hasExpiration=false;this.stock=stock;
	  }StoreProduct(String label,double price){
	    stock=0; this.label=label;this.price=price;
	  }
	  void display(){
	    System.out.println(label+" "+price+" "+ category+ " "+ hasExpiration+" "+ stock);
	  }

}
