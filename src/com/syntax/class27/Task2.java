package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	//Create an arrayList of words. Remove every word that ends with “e”. Use iterator

	public static void main(String[] args) {
		ArrayList <String> words=new ArrayList<>();
		words.add("cake");
		words.add("hello");
		words.add("bye");
		words.add("apple");
		words.add("book");
		String word=words.toString();
		//boolean  check=word.endsWith("e");
		Iterator <String> w=words.iterator();
		while(w.hasNext()) {
			if(w.next().endsWith("e")) {
				w.remove();
			}
		}
		System.out.println(words);
		
	}

}
