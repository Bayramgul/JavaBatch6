package com.syntax.class26;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. Find out whether
		 * the given ArrayList is empty or not? Check whether the specific name is
		 * present in an ArrayList or not? Find the size of your arrayList and print all
		 * values from that
		 */
		ArrayList<String> names=new ArrayList<>();
		names.add("Anna");
		names.add("Andy");
		names.add("Thomas");
		names.add("Jennifer");
		names.add("Celine");
		System.out.println("Is the ArrayList empty: "+names.isEmpty());
		System.out.println("Does the ArrayList contains Anna : "+ names.contains("Anna"));
		System.out.println("How many names are stored in arraylist: "+names.size());
		System.out.println("Printing values sinside arraylist:"+names);
		System.out.println("****Retrieving the names from arraylist*** ");
		for(String name:names) {
			System.out.println(name);
			
		}
		
	}

}
