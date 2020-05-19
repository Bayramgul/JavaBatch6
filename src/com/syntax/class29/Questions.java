package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Questions {

	public static void main(String[] args) {
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("James");
		Set<String> set=new LinkedHashSet<>();
		set.addAll(aList);//store in LinkedHashSet and print to remove duplicates
		System.out.println(set);
		if(set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}//1 convert to list
		List <String> list=new ArrayList<>(set);//converts to ArrayList and get element by index number
		System.out.println(list.get(3));
		// to sort elements of any collection
		Collections.sort(list);//Collections is a utility class & that have methods to work with Collections,Collection is interface
		System.out.println(list);
		Collections.max(aList);
		Collections.min(aList);
		System.out.println(Collections.min(aList));
		//Arrays.sort is for sorting arrays
	}

}
