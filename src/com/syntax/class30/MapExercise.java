package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {
		// how many times each character is  present in given String and how many times each word is present in this String
		//use maps and find out how many times. happy coding :)
		String texts="This is an awesome occation. I love coding";
		char [] text=texts.toCharArray();
		Map <Character,Integer> occur=new HashMap<>();
		for(char t:text) {
			//get the character
			Integer count=occur.get(t);//get the value of key which is integer and gives the number, simply i'm pairing Key to value
			if(count==null) {// which means it doesn't have anything
				occur.put(t, 1);//add pair to the map and if it is more than one increase the number by one
			}else {
				occur.put(t, count+1);
			}
		}
		System.out.println(occur);
		Map<String,Integer> occurs=new HashMap<>();
		String [] words=texts.split(" ");
		for(String word:words) {
			Integer count=occurs.get(word);//word is key and will give me the value so assign to integer variable
			if(count==null) {
				occurs.put(word, 1);
			}else {
				occurs.put(word,count+1);
			}
		}System.out.println(occurs);
	}
}
