package com.syntax.class29;

import java.util.HashMap;

public class MapInfo {

	public static void main(String[] args) {
		HashMap<String , String> map=new HashMap(); //doesn't maintain order of insertion
		map.put("name", "Jane");//u can repeat value but not key, it will only print the first key
		map.put("lastname", "Smith");
		map.put("Address", "123 test");
		map.put("city", "Chantilly");
		//check if map has any elements
		boolean isEmpty=map.isEmpty();
		System.out.println("Is Map empty "+isEmpty);
		//can we duplicate keys? No, previous will be reassigned or replaced
		map.put("name", "John");
		map.get("lastname");
		System.out.println(map.get("lastname"));
		map.remove("city");//removes objects 
		map.replace("name", "William");//replace value
		
	}

}
