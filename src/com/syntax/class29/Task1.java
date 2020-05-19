package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a Set collection in which you need to add names of the countries. In
		 * this set we want all objects to be sorted in alphabetical order. Using 2
		 * different ways retrieve all elements from set.
		 */
		Set<String> countries=new TreeSet<>();
		countries.add("USA");
		countries.add("Japan");
		countries.add("China");
		countries.add("Turkmenistan");
		for(String c:countries) {
			System.out.print(c+" ");
		}
		System.out.println();
		 Iterator c=countries.iterator();
		 while(c.hasNext()) {
			 System.out.print(c.next()+" ");
		 }
	}

}
