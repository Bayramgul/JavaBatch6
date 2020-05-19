package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Set of cities in which you want to make sure that insertion order is
		 * maintained. Using Iterator remove any city that starts with “A”;
		 */
		
		Set <String> cities=new LinkedHashSet<>();
		
		cities.add("Washington DC");
		cities.add("Ashgabat");
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("NY");
		Iterator<String> city=cities.iterator();
		while(city.hasNext()) {
			String c=city.next();
			if(c.startsWith("A")) {
				city.remove();
			}
		}
		System.out.println(cities);
		
		
	}

}
