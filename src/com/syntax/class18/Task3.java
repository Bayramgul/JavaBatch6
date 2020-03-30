package com.syntax.class18;

public class Task3 {
	
	Task3(){
		System.out.println("This is 1 st default constructor");
		
	}public Task3(String text){
		System.out.println("This is public constructor");
		
	}private Task3(int i){
		System.out.println("This is private constructor");
		
	}protected Task3(String a, int i){
		System.out.println("This is protected constructor");
		
	}

	public static void main(String[] args) {
		// Write a program that will have 4 different access levels of constructors and
		// create 3 objects of this class: 1 - inside same class; 2 - from outside the
		// class; 3 - from different class inside different package and observe result.
      Task3 obj1=new Task3();
      Task3 obj2=new Task3("2nd");
      Task3 obj3=new Task3(3);
      Task3 obj4=new Task3("4th", 4);
	}

}
