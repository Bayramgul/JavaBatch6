package com.syntax.class15;

public class LanguageTest {

	public static void main(String[] args) {
		Language obj=new Language();
		obj.greeting("Turkmenistan", "salam");
		obj.greeting("Russia", "privet");
		obj.greeting("USA", "hello");
		obj.greeting("Turkey", "merhaba");
		
		obj.welcome("russia");
	}

}
