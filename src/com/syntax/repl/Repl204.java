package com.syntax.repl;
import java.util.*;
import java.util.Map.Entry;
/*
 * Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10); 
map.put("apple", 30); 
map.put("orange", 20); 

using created display method to display. 

then clear the map. 

use the same method to display

 */

public class Repl204 {
	static void Display(Map<String,Integer> map){
	    Set<Entry<String,Integer>> entry=map.entrySet();
	    if(!map.isEmpty()){
	      for(Entry<String,Integer> e:entry){
	        System.out.println(e);
	      }
	    }else{
	      System.out.println("map is empty");
	    }
	  }
	public static void main(String []args){
	    Map<String,Integer> map=new HashMap<>();
	    map.put("mango", 10); 
	    map.put("apple", 30); 
	    map.put("orange", 20);
	    
	   Display(map);
	   map.clear();
	   Display(map);
	   
	    
	  }

}
