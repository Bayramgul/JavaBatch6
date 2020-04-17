package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList <Integer> array=new ArrayList<>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		
		Iterator <Integer> arr=array.iterator();//calling iterator and assigning to integer type Iterator 
		while(arr.hasNext()) {//validation
			System.out.println(arr.next());//traverse elements one by one 
		}
	}

}
