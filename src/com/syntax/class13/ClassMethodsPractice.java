package com.syntax.class13;

import java.util.Scanner;

public class ClassMethodsPractice {

	public static void main(String[] args) {
		People member=new People();
//		member.name="Anna";
//		member.age=35;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println(" Please enter your age");
		int age=scan.nextInt();
		
		People member1=new People();
//		member1.name="Kate";
//		member1.age=55;
		
		member.define(name,age);// methods with parameters
		//member1.define(name,age);
	}
}
 	 class People{
	 public int age;
	public String name;
	 
	 
	void define(String name, int age) {
		 System.out.println("Hello and Welcome. This is "+name+" "+age);
		 
	 }
	
}