package com.syntax.repl;

public class Repl157 {
	public static void main(String[] args) {
		Child obj=new Child();
	    obj.method();
	    
	    Parent obj1=new Parent();
	    obj1.method();
	}

}
class Parent{
	void method(){
	    System.out.println("Parent method");
	  }
}
class Child extends Parent{
	void method(){
	    System.out.println("Child method");
	  }
}
