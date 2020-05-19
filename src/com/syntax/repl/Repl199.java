package com.syntax.repl;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Repl199 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		  map.put("mango", 10); 
		  map.put("apple", 30); 
		  map.put("orange", 20); 
		  map.put("mango", 40); 
		  map.put("mango", 40); 
		  
		 int min= map.get("mango");
		  Set<Entry<String,Integer>> entry=map.entrySet();
		  for(Entry<String,Integer> e:entry){
			  if(e.getValue()<=min) {
				  System.out.println("Key = "+e.getKey()+" and value = "+e.getValue());
			  }
		    
		  }
	}

}
