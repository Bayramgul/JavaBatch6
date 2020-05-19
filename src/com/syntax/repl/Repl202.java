package com.syntax.repl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Repl202 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		 
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
//		Set<Entry<String,String>> ent=map.entrySet();
//		for(Entry<String,String> e:ent){
//		  System.out.println(e.getKey()+" : "+ e.getValue());
//		}
//		System.out.println("----------");
//		//map.remove("ONE");
//	    //map.remove("FOUR");
//	    for(Entry<String,String> e:ent){
//			  System.out.println(e.getKey()+" : "+ e.getValue());
//			}
		Set<Entry<String,String>> entry=map.entrySet();
		Iterator<Entry<String,String>> it=entry.iterator();
		while(it.hasNext()){
		  Entry<String,String> e=it.next();
		  if(e.getKey().equals("THREE")||e.getKey().equals("FIVE")){
		    e.getValue().replace("CCC", "ASEL");
		    e.getValue().replace("EEE", "SUMAIR");
		    
		  }
		  System.out.println(e.getKey()+" : "+e.getValue());
		}

	}

}
