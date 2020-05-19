package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C",3 );
		map.put("D", 4);
		System.out.println(map.size());//n of elements
		System.out.println(map.containsKey("E"));
		System.out.println(map.containsValue(2));
		System.out.println(map.keySet());//set of keys
		System.out.println(map.values());//set of values
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println(map.get("E"));// we dont have E key so value is null, HAshmap allows key with null value but HashTable not
		
		
	}

}
