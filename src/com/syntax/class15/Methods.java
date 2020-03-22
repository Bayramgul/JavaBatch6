package com.syntax.class15;

public class Methods {

	void sayWelcome() {
		for (int i=1; i<=10;i++) {
			System.out.println("Welcome");// this is hard coding
		}
		
	}
	//create a method will say any word #number of times
	
	void sayAnything(String word,int times) {
		for(int i=1;i<=times;i++) {
			System.out.println(word);
		}
	}
	// create method isItRaining that will accept boolean value as a paramter
	// and based on the value it will print message accordingly
	void isItRaining(boolean raining ) {
	if(raining) {
		System.out.println("It is raining stay home and learn Java");
	}else {
		System.out.println("It is not raining go for a walk");
		
	}
}
}
