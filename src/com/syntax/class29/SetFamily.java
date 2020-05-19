package com.syntax.class29;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetFamily {

	public static void main(String[] args) {
		
		Set<String> veggies=new HashSet<>();//insertion order is not followed by hashet
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		
		System.out.println(veggies);//insertion order followed by LinkedHasSet,
		
		Set<String> fruits=new LinkedHashSet<>();// LinkedHasSet follow insertion order
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("tomato");
		fruits.add("mango");
		fruits.add("banana");
		System.out.println(fruits);
		//but TreeSet sorts according to alphabet, ascending order
		Set<String> food=new TreeSet<>();//instead of <String> we can say Object Set<Object> food=new TreeSet<veggies>()
		food.addAll(fruits);
		food.addAll(veggies);
		System.out.println(food);
		
		
	}
}
