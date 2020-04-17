package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDema {

	public static void main(String[] args) {
		//create ArrayList to store name
		
		ArrayList <String> names=new ArrayList<>();
		// adding String objects into ArrayList class
		names.add("Jane");
		names.add("John");
		//access elements from ArrayList
		String st=names.get(0);
		System.out.println(st);
		//ArrayList is a dynamic array
		names.add("Adrian");
		names.add("William");
		//how to get number of elements inside of ArrayList
		int size=names.size();
		System.out.println(size);
		names.add("James");
		names.add("John");
		System.out.println(names.size());
		//remove objects from ArrayList
		names.remove(0);
		System.out.println(names.size());
		names.remove("John");//removes first John 
		System.out.println(names.size());
		System.out.println(names);
		// replace some names with another names inside the ArrayList
		names.set(0, "Gul");
		System.out.println(names);
		//how to retrieve values from ArrayList one by one;
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("--------");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		// create an arrayList to store numbers
		ArrayList <Integer> nums=new ArrayList<>();// in ArrayListt we have to store non primitive type
		nums.add(10);//auto boxing
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.contains(30);
		for(int i=0;i<nums.size();i++) {
			int num=nums.get(i);//auto unboxing, you can either declare int or Integer;
			System.out.println(num);
		}
		System.out.println("_________");
		
		for(Integer num:nums) {//you can either do Integer
			System.out.println(num);
		}
		System.out.println(nums.contains(30));
		nums.clear();//removes all elements from ArrayList
		nums.remove(0);//removes element at that specific index
		
		
	}

}
