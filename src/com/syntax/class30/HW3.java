package com.syntax.class30;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * Create a Map that will store Employee name and salary. Write a logic to
		 * retrieve an employee who gets the highest salary. Output should be in the
		 * below format John Smith=$100000
		 */
		Map<String,Double> emp=new TreeMap<>();
		emp.put("John Smith",70000.0);
		emp.put("James Adams",80000.0);
		emp.put("William Roberts",90000.0);
		emp.put("Adrian Foster",100000.0);
		// 1st way
		Double maxSalary=Collections.max(emp.values()); 
		Set<Entry<String,Double>> entries=emp.entrySet();
		Double max=emp.get("John Smith");//return the  value
		//.get(key);-->return the value of specific key,
		
		for(Entry<String,Double> empl:entries) {
			if(empl.getValue()>max)
			{
				max=empl.getValue();
				System.out.println(empl.getKey()+"&="+empl.getValue());}
			}
		
		
		//2nd way with advanced loop
		for(Entry<String,Double> entry:entries) {
			if(entry.getValue()==maxSalary) {
				System.out.println(entry.getKey()+"=$"+ entry.getValue());
			}
		}

		//2nd way with iterator
		Iterator <Entry<String,Double>> It=entries.iterator();
		while(It.hasNext()) {
			Entry<String,Double> e=It.next();
			if(e.getValue()==maxSalary) {
				System.out.println(e.getKey()+"=$"+ e.getValue());
			}
			}
		}
	 
	}


