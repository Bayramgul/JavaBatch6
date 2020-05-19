package com.syntax.class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW4 {

	public static void main(String[] args) {
		/*
		 * Create the collection that will store single unique Objects of a String type
		 * in which order is preserved.
		 * Write a logic to concatenate all string from the collection.
		 */
		Set<String> obj=new LinkedHashSet<>();
		obj.add("Welcome");
		obj.add(" to Syntax ");
		obj.add("Technologies.");
		obj.add(" Happy");
		obj.add(" coding!");
		for(String str:obj) {
			System.out.print(str);
		}
		
	}

}
