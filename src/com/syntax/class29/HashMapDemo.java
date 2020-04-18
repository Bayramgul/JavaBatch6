package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//consists of keys, values; key is like index number so we can't repeat it
		HashMap<String , String> map=new HashMap();//we need to specify the data type
		map.put("name", "Jane");//u can repeat value but not key, it will only print the first key
		map.put("name1", "Jane");
		map.put("lastname", "John");
		map.put("middlename", "James");
		
		System.out.println("\n All elements: "+map);// doesn't follow insertion order while printing
		System.out.println("\n Value of name: "+map.get("name"));//we get specific key's value
		System.out.println("\n if we have John value: "+map.containsValue("John"));//boolean value return true/false.
		System.out.println("\n All values: "+map.values());//prints all values
		System.out.println("\n All sets: "+map.keySet()+"\n");//to print all keys use keySet() method, it will give the Set of keys
		Set<String> keys=map.keySet();//Store all keys inside key variable of Set interface's String type
		//to retrieve all elements 1 by one use advanced loop 
		
		for(String key:keys) {
			System.out.println("Key is: "+key+" and value is:  "+map.get(key));
							//key       value
		}System.out.println("------------------");
		//to retrieve all elements 1 by one use iterator 
		Iterator<String> key=keys.iterator();
		while(key.hasNext()) {
			String k=key.next();
			System.out.println("Key is: "+k+" and value is:  "+map.get(k));
		}
	}

}
