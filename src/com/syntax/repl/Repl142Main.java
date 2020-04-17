package com.syntax.repl;

public class Repl142Main {

	public static void main(String[] args) {
		/*
		 * Create two Object of ShoppingStore and pass the parameters to Constructor.
		 * then using each object call the method itemTotalPrice. Store the returned
		 * value of each object. Calculate sum of both object and print the result.
		 * 
		 * Output: Blanket Total Value 99.98 Mattress Total Value 439.18 You purchased
		 * 539.16 Today
		 * 
		 */
		
		
		Repl142 obj1=new Repl142 (" Blanket",0.9998,100);
		double val1=obj1.itemTotalPrice();
		System.out.println(" Blanket Total Value "+ val1);
		Repl142 obj2=new Repl142 ("Mattress",4.3918,100);
		double val2=obj2.itemTotalPrice();
		System.out.println(" Mattress Total Value "+ val2);
		System.out.println("You purchased "+(val1+val2));
	}

}
