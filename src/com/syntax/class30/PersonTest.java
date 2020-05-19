package com.syntax.class30;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {
		Map<Integer,Person> tmap=new TreeMap<>();
		tmap.put(111,new Person("John", "Smith",20,70000));
		tmap.put(222,new Person("William", "Adams",30,80000));
		tmap.put(333,new Person("James", "Robert",25,90000));
		tmap.put(444,new Person("Jane", "Austin",35,100000));
		Set<Integer> keys= tmap.keySet();
		for(int key:keys) {
			Person p=tmap.get(key);
			p.displayInfo();
		}
	}

}
