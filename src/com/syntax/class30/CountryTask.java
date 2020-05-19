package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CountryTask {

	public static void main(String[] args) {
		Map<String, String> country=new TreeMap<>();
		country.put("USA", "Washington Dc");
		country.put("Turkey", "Ankara");
		country.put("Japan","Tokyo" );
		System.out.println("===retrieve keys using for each loop");
		for(String keys:country.keySet()){
			System.out.println("Key: "+keys);
		}
		System.out.println("===retrieve keys using iterator===");
		Iterator<String> key=country.keySet().iterator();
		while(key.hasNext()) {
			System.out.println("Key: "+key.next());
		}
		System.out.println("===retrieve values using for each loop");
		for(String vals:country.values()){
			System.out.println("Value: "+vals);
		}
		System.out.println("===retrieve valuess using iterator===");
		
		Iterator <String> val=country.values().iterator();
		while(val.hasNext()) {
			System.out.println("Value: "+val.next());
		}
	}

}
