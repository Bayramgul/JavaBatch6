package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstAndIterator {

	public static void main(String[] args) {
		//arraylist of chocolates
		ArrayList<String> choco=new ArrayList<>();
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		//arraylist of sweets
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		System.out.println(sweets.size());//prints all numbers 
		System.out.println(sweets);
		//we want to iterate through the collection/iterates forward direction
		Iterator <String> s=sweets.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		// i want to get elements backwords
		for(int i =sweets.size()-1;i>=0;i--) {
			System.out.println(sweets.get(i));
		}
		// advanced for loop 
		for(String str:sweets) {
			System.out.println(str);
		}
		
	}

}
