package com.syntax.class19;

public class Book {
	/*
	 * Write program as a Book class that will have 2 Constructors. While creating
	 * an object make sure: Instance variables are being initialized Both
	 * Constructors are being executed
	 * 
	 */
	int i;
	String book;
	Book(String book){
		
		this(10);
		this.book=book;
		System.out.println("I am  consructor with String argument "+ book);
		
		
	}
	Book(int i){
		this.i=i;
		System.out.println("I hold 10 books");
		
	}
	public static void main(String[] args) {
		Book b=new Book("book");
	}

}
