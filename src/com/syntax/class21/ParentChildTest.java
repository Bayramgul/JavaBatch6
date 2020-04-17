package com.syntax.class21;

public class ParentChildTest {

	public static void main(String[] args) {
		Child ch=new Child();
		ch.display();// will call child class method
		System.out.println("---------------------");
		ch.sayHello();
	}

}
