
package com.syntax.class28;
import com.syntax.class27.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.syntax.class24.Vehicle;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <String> alist1=new LinkedList<>();
		alist1.add("Yunus");//comes from collections interface
		alist1.add(0, "Reyhan");//comes from List
		alist1.add("Pavel");
		alist1.add("Farid");
		System.out.println(alist1.size());
		Iterator<String> list=alist1.iterator();
		while( list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("-------");
		for(String str:alist1) {
			System.out.println(str);
			
		}
		System.out.println("-------");
		for(int i=0; i<alist1.size();i++) {
			System.out.println(alist1.get(i));
		}
		
		// LinkedList <Food> food=new LinkedList<>();
		
	}

}
