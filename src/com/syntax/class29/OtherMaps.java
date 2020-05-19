package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {//Keys are always unique and they are objects
		//Store student id and corresponding name
		Map<Integer,String>lmap=new LinkedHashMap<>();// preserves the insertion order
		lmap.put(100, "John Smith");
		lmap.put(101,"Jane Williams");
		lmap.put(102,"Faisal Sakhi");
		lmap.put(103,"Ali Tarlaci");
		System.out.println(lmap);
		//
		Map<Integer,String> tmap=new TreeMap<>();//orders keys with corresponding value according to alphabetical order
		tmap.put(100, "John Smith");
		tmap.put(101,"Jane Williams");
		tmap.put(102,"Faisal Sakhi");
		tmap.put(103,"Ali Tarlaci");
		System.out.println(tmap);
		// create a map of Country and population and sort countries in Alphabetical order
		Map<String, Integer> population=new TreeMap<>();
		population.put("USA", 330000000);
		population.put("Kazakstan",18000000);
		population.put("India", 1326000000);
		System.out.println(population);
	}

}
