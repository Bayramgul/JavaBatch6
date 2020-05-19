package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create a Map from array of cities that will sort keys in alphabetical order.
		 * As a key store the name of the city and as a value store the length of the
		 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). If any city name
		 * is more than 7 characters remove that city .
		 */
		
		Map<String,Integer> cities=new TreeMap<>();
		cities.put("Paris", 5);
		cities.put("Moscow",6);
		cities.put("Washington Dc", 13);
		cities.put("Ankara",6);
		cities.put("Mclean",6);
		cities.put("California",10);
		System.out.println(cities);
		
		Set<Entry<String,Integer>> entries=cities.entrySet();// gives set of Entries
		Iterator<Entry<String,Integer>> It=entries.iterator();
		while(It.hasNext()) {
			String key=It.next().getKey();
			//Integer value=It.next().getValue();
			if(key.length()>7) {
				It.remove();
			}
		}
		System.out.println(cities);
		}
	}


