package com.syntax.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Interview09 {
	public static void main(String[] args) {
		List <String>aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		Set<String> list=new TreeSet<>();
		list.addAll(aList);
		System.out.println(list);
		
	}

}
