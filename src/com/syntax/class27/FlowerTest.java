package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		//
		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower") };
		ArrayList<Flower> flowers = new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
System.out.println("--- Iterator ----");
		Iterator<Flower> f = flowers.iterator();
		while (f.hasNext()) {
			f.next().bloom();
		}
System.out.println("-------advanced loop------");
		//advanced loop 
		for (Flower fl : flowers) {
		fl.bloom();
		}
System.out.println("------ for loop------");
		// for loops
		for(int i=0;i<flowers.size();i++) {
			flowers.get(i).bloom();
		}
	
}
	
}
