package com.syntax.class15;

public class Language {
	//first version
	void greeting(String country, String greet) {
		System.out.println("In " + country + " they say " + greet);
	}
	//2nd version
	void welcome(String country) {
		switch (country.toLowerCase())
		{case "turkmenistan":
			System.out.println("Salam");break;
		case "russia":
			System.out.println("Privet");
			
		}}
		
}
