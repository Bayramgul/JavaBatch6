package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		//generic arraylist/store only one type values
		ArrayList <Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.99);
		alist.add(100.99);
		System.out.println(alist);
		//replace element
		alist.set(1, 13.90);
		System.out.println(alist);
		alist.remove(13.90);
		System.out.println(alist);
		
		//retrieve single element
		System.out.println(alist.get(1));
		//retrieve all elements from collection
		//enhanced for loop
		for(double a:alist) {
			System.out.println(a);
		}
		//2.for loop
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		//3.iterator
		Iterator <Double> list=alist.iterator();
		while(list.hasNext()) {
			System.out.println(list.next() );
		}
		System.out.println("----------non generic --------");
		//2.non generic collection/arraylist
		ArrayList obj=new ArrayList();
		obj.add("hello");
		obj.add(100);
		obj.add('c');
		obj.addAll(alist);//stores collection object 
		System.out.println(obj);
		//retrieve all elements from collection
		for(Object o:obj) {// every class has parent Object class, all objects are children of object class
			System.out.println(o);
		}
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		
	}

}
