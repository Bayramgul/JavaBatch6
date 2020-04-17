package com.syntax.repl;

public class Repl138 {

	public static void main(String[] args) {
		StoreProduct obj1=new StoreProduct("Eggs", 3.0 ,"Produce", true ,10);
		StoreProduct obj2=new StoreProduct("Paper Towels", 2.0, 24);
		StoreProduct obj3=new StoreProduct("Paper Towels", 2);
		obj1.display();
		obj2.display();
		obj3.display();
	}

}
