package com.syntax.class28;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// we can't instantiate Set(interface) so we create HashSet class object and refer to Set/Upcasting
		Set<Integer> values = new HashSet<>();
		values.add(12);
		values.add(34);
		values.add(1);
		values.add(12);
		values.add(99);
		System.out.println(values);// doesn't print in sequence, doesn't print duplicates
		System.out.println(values.add(38));
		System.out.println(values.add(34));//checks if there is 34 in the collection and returns false if there is any
		Set<Integer> val = new TreeSet<>();//follows a sequence
		val.add(12);
		val.add(2);
		val.add(7);
		System.out.println(val);// prints in increasing order
	}

}
