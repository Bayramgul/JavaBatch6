package com.syntax.repl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl188 {
//USA, Kazakhstan, Pakistan, Russia]
	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");//1
		countries.add("Kazakhstan");//2
		countries.add("Australia");
		countries.add("Pakistan");//4
		countries.add("Russia");//5
		countries.add("Azerbaijan");
		
			List<String> country = new LinkedList<>();
		
		for(int i=0;i<countries.size();i+=2) {
			countries.remove(i);
		}
		
		country.addAll(countries);
		System.out.println(country);
	}

}
