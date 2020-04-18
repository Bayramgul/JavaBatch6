package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetIntro {

	public static void main(String[] args) {
		HashSet<String> breakfast=new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cheese");
		breakfast.add("coffee");
		breakfast.add("eggs");
		//how many elements in the set
		System.out.println(breakfast.size());
		//insertion order is not maintained
		System.out.println(breakfast);
		//we need to retrive element;no get method available
		//we can retrieve all elements
		Iterator<String> myIt=breakfast.iterator();
		while(myIt.hasNext()) {
			System.out.println(myIt.next());
		}
		//
		System.out.println("--------");
		for(String list:breakfast) {
			System.out.println(list);
		}
		
	}

}
