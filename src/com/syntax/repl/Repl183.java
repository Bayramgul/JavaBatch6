package com.syntax.repl;

import java.util.Iterator;
import java.util.LinkedList;

public class Repl183 {

	public static void main(String[] args) {
		 LinkedList<Integer> nums=new LinkedList<>();
		    for(int i=50;i<100;i++){
		      nums.add(i);
		    }
		    System.out.println(nums);
		  Iterator <Integer> n=nums.iterator();
		  while(n.hasNext()) {
			  int num=n.next();
			  if(num%3!=0) {
				 n.remove(); 
			  }
		  }
		  System.out.println(nums);
		  
	}

}
