package com.syntax.class22;

public class AnimalTest {

	public static void main(String[] args) {
// Non primitive casting:upcasting, widening by referring to superclass
				Animal tiger=new Tiger();
				tiger.eat();
				tiger.sleep();// during runtime java will print overridden method, which is based on your object
				//tiger.run(); CE:method run is undefined
	System.out.println("-----Accessing methods using Parent class");			
	Animal ani=new Animal();  
	ani.eat();
	ani.sleep();
	System.out.println("------Accessing methods using Cn hild classs");
	Tiger t=new Tiger();
	t.eat();
	t.sleep();
	t.run();
	
	}

}
