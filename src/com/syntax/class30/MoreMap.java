package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MoreMap {

	public static void main(String[] args) {
		Map<Integer, String> building = new LinkedHashMap<>();// any map classes are ignoring dupliactes
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "Microsoft");
		building.put(5, "Uber");
		building.put(4, "Facebook");
		building.put(7, "Google");
		System.out.println("Number of entries: " + building.size());
		building.replace(4, "Instagram");// updating 4 th floor value
		building.remove(7);// removes value of 7
		System.out.println(building);
		System.out.println(building.entrySet());
		
		System.out.println("------ getting keys using iterator-------");
		Set <Integer>keys=building.keySet();
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			System.out.println("Key is "+key +" and the value is "+ building.get(key));
		}
		System.out.println("------getting keys using for each loop-------");
		for(int k:keys) {
			System.out.println("Key is "+k+ " and the value is "+building.get(k));
		}
		System.out.println(building.values());
		Collection<String>values=building.values();//we can store inside Collection
		for( String value:values) {
			System.out.println(value);
			
		}
		System.out.println("------Using iterator for retrieving all values-----");
		Iterator <String> val=values.iterator();// we cant use building.iterator bcuz map is not a collection
		
		while(val.hasNext()) {
			System.out.println(val.next());
		}
	
	}

}
