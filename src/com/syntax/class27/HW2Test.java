package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2Test {

	public static void main(String[] args) {
		ArrayList <Food> foods=new ArrayList<>();
		foods.add(new Cake());
		foods.add(new Palaw());
		foods.add(new Olivye());
		foods.add(new Manty());
		System.out.println("********* Advanced Loop*********");
		
		for(Food food:foods) {
			food.bake();
			food.cook();
			food.makeSalad();
			System.out.println("------");
		}
		System.out.println("******** for loop******");
		for(int i=0;i<foods.size();i++) {
			foods.get(i).bake();
			foods.get(i).cook();
			foods.get(i).makeSalad();
			System.out.println("----");
		}
		System.out.println("******* Iterator********");
		Iterator <Food> fd=foods.iterator();
		while(fd.hasNext()) {
			Food f1=fd.next();
			f1.bake();
			f1.cook();
			f1.makeSalad();
			System.out.println("-------");
		}
	}

}
