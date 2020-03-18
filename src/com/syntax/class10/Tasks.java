package com.syntax.class10;

public class Tasks {

	public static void main(String[] args) {
		String[] animals = { "cat", "dog", "monkey", "cow", "duck", "elephant" };
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

		for (String ani : animals) {
			System.out.println(ani);
		}

		// Create an array on integers and calculate the sum of all integer elements in
		// an array.
		int[] integers = { 12, 34, 56, 13 };
		int sum = 0;
		for (int integer1 : integers) {
			sum += integer1;

		}
		System.out.println(sum);

		// Create an array of countries. While retrieving all values from an array print
		// capital for each country. (use 2 different loops)
		
		String[]country= {"USA","China","Turkey","Japan"};
		for (String countries:country) {
			if(countries.equals("USA")) {
			System.out.println("Washington DC");
		}else if(countries.equals("China")){
			System.out.println("Beijing");
		}else if(countries.equals("Turkey")) {
			System.out.println("Ankara");
		}else if(countries.equals("Japan")) {
			System.out.println("Tokyo");
		}
			for(int i=0;i< country.length;i++) {
				switch (country[i]) {
				case "USA":
					System.out.println("Washington DC");break;
				case "China":
					System.out.println("Beijing");break;
				case "Turkey":
					System.out.println("Ankara");break;
				case "Japan":
					System.out.println("Tokyo");break;
				}
				
//				for(int i=0;i< country.length;i++) {
//					switch (country[i]) {
//					case "USA":
//		
	}

}
}}