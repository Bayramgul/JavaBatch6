package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSpecial {

	public static void main(String[] args) {
		TreeMap<String, Integer> map=new TreeMap<>();//TreeMap implements Navigable and that's why it has special methods
		map.put("A", 111);
		map.put("B", 222);
		map.put("C", 333);
		map.put("D", 444);
		map.put("E", 111);
		System.out.println(map);
		System.out.println(map.higherKey("B"));// compares value of B with previous and next one and tells the higher one 
		System.out.println(map.ceilingKey("A"));// checks if greater or equals to
		System.out.println(map.floorKey("C"));
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.subMap("A", "D"));// shows the portion of the map, left key is inclusive and right key is exclusive
	}

}
