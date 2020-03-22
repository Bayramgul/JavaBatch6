package com.syntax.class15;

public class MethodsTest {

	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.sayWelcome();
		
		obj.sayAnything("Hello", 2);//passing values
	//in paramters String comes first and int comes 2nd be respectively
	obj.isItRaining(true);// we write the boolean answer under main method
	obj.isItRaining(false);// I am calling method in else

}
}