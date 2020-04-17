package com.syntax.repl;

public class Repl131 {
	String name;
	public String city;
	protected String schoolName;
	private int batchNumber;
	
	public void displayDetails() {
		System.out.println("My name is " +name+" and I live in "+ city+ " I study at "+schoolName+" in batch "+batchNumber);
	}

	public static void main(String[] args) {
		Repl131 obj=new Repl131();
		
		obj.displayDetails();
		
		System.out.println(Repl132.method1());
		System.out.println(Repl132.method2());
		System.out.println(	Repl132.method3());
	}

}
