package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {
	String type, name;

	Store(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public void display() {
		System.out.println("This is store " + name);
	}

	public abstract void workingHours();
}

class Nike extends Store {

	Nike(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 10 am until 6 pm");
	}

}

class Costco extends Store {

	Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 8 am until 8 pm");
	}

}

class Amazon extends Store {

	Amazon(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works 24/7");
	}
}
public class UserDefinedClassInMap {
	public static void main(String[] args) {
//we wanna store stores in form1-->Amazon, 2--> costco; 3--->Nike
		Map<Integer, Store> stores = new LinkedHashMap<>();
		stores.put(1, new Nike("Store", "Nike"));
		stores.put(2, new Amazon("Online", "Amazon"));
		stores.put(3, new Nike("WholeSale", "Costco"));

		// to get an access to all methods of our Store Objects:
		// values();keySet();entrySet();
		// 1.way -->get all Value Objects
		Collection<Store> col = stores.values();
		for (Store store : col) {
			store.display();
			store.workingHours();
		}
		System.out.println("-----");
		// 2.nd way-->get all Entry objects
		Set<Entry<Integer, Store>> entries = stores.entrySet();
		Iterator<Entry<Integer, Store>> store = entries.iterator();
		while (store.hasNext()) {
			Entry<Integer, Store> str = store.next();
			str.getValue().display();
			str.getValue().workingHours();
		}
		System.out.println("------");
		//3.way advanced for loop
		for(Entry<Integer,Store> entry:entries) {
			entry.getValue().display();
			entry.getValue().workingHours();
		}
		//4.way 
		Set<Integer> keys=stores.keySet();
		for(int key:keys) {
			stores.get(key).display();
			stores.get(key).workingHours();
		}
		
	}
}
