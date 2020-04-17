package com.syntax.repl;

public class Repl137Main {

	public static void main(String[] args) {
		Repl137 obj1=new Repl137("Toyota", "Prius", 4, 120, 30000.0);
		Repl137 obj2=new Repl137("Toyota", "Prius",  120, 30000.0);
		Repl137 obj3=new Repl137(4, 120, 30000.0);
		Repl137 obj4=new Repl137("Toyota", "Prius", 4);
		obj1.diplay();
		obj2.diplay();
		obj3.diplay();
		obj4.diplay();
	}

}
