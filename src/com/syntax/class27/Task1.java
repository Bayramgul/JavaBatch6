package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
	ArrayList <String> cars=new ArrayList<>();
	cars.add("Toyota");
	cars.add("BMW");
	cars.add("Infiniti");
	//advaced loop
	for(String car:cars) {
		System.out.println(car);
	}System.out.println("------");
	// for loop
	for(int i=0;i<cars.size();i++) {
		System.out.println(cars.get(i));
	}System.out.println("------");
	//iterator
	Iterator <String> car=cars.iterator();
	while(car.hasNext()) {
		System.out.println(car.next());
	}
	
	
	}

}
