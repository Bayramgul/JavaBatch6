package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryTask {

	public static void main(String[] args) {
		/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

Retrieve all keys and values from a Best Buy map using EntrySet.
		 * 
		 */
		Map <Integer,String> best=new LinkedHashMap<>();
		best.put(7664847 ,"Printer");
		best.put(7879885, "TV ");
		best.put(7879800, "Computer ");
		Set<Entry<Integer,String>> setEntry=best.entrySet();
		System.out.println(setEntry);
		Iterator<Entry<Integer,String>> It=setEntry.iterator();
		while(It.hasNext()) {
			Entry<Integer,String> e=It.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
