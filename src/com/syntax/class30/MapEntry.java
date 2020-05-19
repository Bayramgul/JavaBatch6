package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		//create a map that will store month and days in the month
		Map<String, Integer> month=new LinkedHashMap<>();
		month.put("Jan", 31);
		month.put("Feb", 28);
		month.put("March", 31);
		month.put("April", 30);
		System.out.println(month.size());//gives you number of entries
		
		// get all entries from the map
		System.out.println(month.entrySet());// this is Set, converted to set that contains all entries
		Set<Entry<String,Integer>> entries=month.entrySet();// we have Entry objects inside Set with the help of entrySet() method
		//loop through all entry objects
		for(Entry m:entries) {
			System.out.println("Entry:"+m);
		}
		for(Entry m:entries) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		System.out.println("----- Using iterator to bo over all entry objects------");
		//iterate through all entry objects
		Iterator<Entry<String, Integer>> it=entries.iterator();
		while(it.hasNext()) {
			Entry <String,Integer>ent=it.next();
			System.out.println("Key:"+ent.getKey()+" val: "+ent.getValue());
		}
		
	}

}
