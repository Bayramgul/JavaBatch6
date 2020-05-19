package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		Map<String, String> country=new TreeMap<>();
		country.put("USA", "Washington Dc");
		country.put("Turkey", "Ankara");
		country.put("Japan","Tokyo" );
		System.out.println(country);
		Set<Entry<String,String>> allEntry=country.entrySet();
		System.out.println(allEntry);
		//loop through all entries to get a key and values as pairs
		for(Entry <String,String> entr:allEntry) {
			String key=entr.getKey();
			String value=entr.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println("---Iterator----");
		Iterator<Entry<String, String>> it=allEntry.iterator();
		while(it.hasNext()) {
			Entry<String,String> e=it.next();
		String entry=e.getKey()+":"+e.getValue();
		System.out.println("entry: "+entry);
		//System.out.println(e); same thing as above
		}
	}

}
