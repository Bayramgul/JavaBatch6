package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {
		//let's create map of countries with capitals
		Map <String,String> hmap=new HashMap<>();
		hmap.put("USA", "Washington Dc");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		hmap.put(null, "another value");
		System.out.println(hmap);
		//how to get all keys from a map? KeySet(),entrySet();
		System.out.println("--------Keys using entry set--------------");
		Set<String> keys=hmap.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Set<Entry<String,String>> entries=hmap.entrySet();
		Iterator <Entry<String,String>> iter=entries.iterator();
		while(iter.hasNext()) {
			String key=iter.next().getKey();
			System.out.println(key);
			System.out.println(iter.next().getKey()+"->"+iter.next().getValue());
		}
//		System.out.println("-----Retrive keys and values with entry Set--------");
//		while(iter.hasNext()) {
//			Entry<String,String> entry=iter.next();
//			String myEntry=entry.getKey()+"--->"+entry.getValue();
//			System.out.println(myEntry);
//		}
		System.out.println("------retrive values values() method--------");
		Collection<String> values=hmap.values();
		it=values.iterator();//we can reuse same it variable
		while(it.hasNext()) {
			System.out.println(it.next());//retrieve values;
		}
		
		
		Map <String,String> htable=new Hashtable<>();
		htable.put("USA", "Washington Dc");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
		//htable.put("Italy", null);-->we can't store null values inside hashtable
		//htable.put(null, "some value"); ---> -->we can't store null keys inside hashtable
		System.out.println(htable);
		//first part of code;
		createMap("City","Fairfax");
		//second part of code
		createMap("City","Washington Dc");
	}
	public static  Map<String,String> createMap(String key,String value) {
		Map map=new HashMap<>();
		map.put(key, value);
		return map;
	}

}
