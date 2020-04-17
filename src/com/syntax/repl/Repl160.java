package com.syntax.repl;

public class Repl160 {

	public static void main(String[] args) {
			Animal cat=new Cat("Cat");
			Animal k1=new Kitten1("Kitten1");
			Animal k2=new Kitten2("Kitten2");
			Animal k3=new Kitten3("Kitten3");
			Kitten1 kit=new Kitten1("Kitty");
// in multilevel inheritance child can have access to parent and grandparent behaviors, features			
			Animal[] cats= {cat,k1,k2,k3};
			for(Animal a:cats) {
				a.eat();
				//a.sleep();
			}
	}

}
