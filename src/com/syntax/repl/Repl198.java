package com.syntax.repl;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl198 {

	public static void main(String[] args) {
		Map<String,String> t=new TreeMap<>();
	    t.put("1 item " ,"apple");
	     t.put("2 item " ,"banana");
	      t.put("3 item " ,"pear");
	       t.put("4 item " ,"tomato");
	        t.put("5 item " ,"mango");
	         t.put("6 item " ,"kiwi");
	         Set<Entry<String,String>> entries=t.entrySet();
	         for(Entry<String,String> entry:entries){
	      System.out.println("Key is "+entry.getKey()+" and values is "
	      +entry.getValue());
	         }
	}

}
