package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		// lets create a grocery map(item, quantity) in which dont care about order
		Map<String, Integer> grocery = new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		System.out.println(grocery);
		// create a map of items to buy(item,quantity) preserve the order
		Map<String, Integer> household = new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("tiolet paper", 10);
		household.put("face maks", 50);
		// combine all list, create a map to store all previous items in ascending order

		Map<String, Integer> shopping = new TreeMap<>(grocery);// instead of put.All() we can pas inside constructor

		shopping.putAll(household);
		System.out.println(shopping);
		// get all keys,shopping.keySet()----> gives set of keys, we can store as a
		// variable inside Set variable
		System.out.println(shopping.keySet());
		for (String key : shopping.keySet()) {
			System.out.println("Key: " + key);
		}
		// get all keys using iterator
		Iterator<String> keys = shopping.keySet().iterator();
		while (keys.hasNext()) {
			String k = keys.next();
			System.out.println("Key: " + k);
		} // get all values using loop
		for (int val : shopping.values()) {
			System.out.println(val);
		}
		// get all values using iterator
		Iterator<Integer> val1=shopping.values().iterator();
		while( val1.hasNext()) {
			System.out.println(val1.next());
		}
	}

}
