package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {

	public static void main(String[] args) {
		//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
		ArrayList <String> drinks=new ArrayList<>();
		drinks.add("ayran");
		drinks.add("Fanta");
		drinks.add("milk");
		drinks.add("lemonade");
		drinks.add("juice");
		Iterator <String> d=drinks.iterator();
		while(d.hasNext()) {
			String drink=d.next();
			if(drink.contains("a")||drink.contains("e")) {
				drink=drink.replaceAll(drink, "water");
			}
			System.out.println(drink);
		}
	
		
	}

}
