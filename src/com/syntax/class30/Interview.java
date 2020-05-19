package com.syntax.class30;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {
	private static void charCount(String str) {
		str = str.replaceAll("[^A-Za-z]", "");
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] cArray = str.toCharArray();
		for (char c : cArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for(Map.Entry entry: map.entrySet()) {
			System.out.println("Character = "+entry.getKey()+" and occurance = "+entry.getValue());
		}
	}
	private static void wordCount(String str) {
		str=str.replace('.', ' ');
		String[] item = str.split(" ");
		Map<String, Long> map = Arrays.stream(item)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Set<String> keys1 = map.keySet();
		for (String s : keys1) {
			System.out.println("Word = " + s + " and occurrance = " + map.get(s));
		}
	}
	public static void main(String[] args) {
		String texts = "This is an awesome occupation . I love coding";
		String texts1 = texts.replaceAll("[^A-Za-z]", "");
		System.out.println("Total Number of Character in the String= " + texts1.length());
		System.out.println("==how many times each character is present in given String======");
		charCount(texts);
		System.out.println("==how many times each word is present in this String======");
		wordCount(texts);
	}

}
