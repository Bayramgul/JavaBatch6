package com.syntax.class11;

public class Countries2DEnhanced {

	public static void main(String[] args) {
		/*
		 * create an array of NA, S A,euro,asian,african
		 * 
		 */
		String [][]countries= {{"USA","Canada", "Mexico"},
							   {"Brazil","Peru","Colombia"},
							   {"Germany","Italy","France"},
							   {"Turkmenistan","Kazakstan"}};
		int nums=0;
		for(String[] count:countries) {
			for(String c:count) {
				
				System.out.println(c);
				nums++;
			
			}
		}System.out.println("The number of total countries is :"+ nums);
		
		int count=0;
		for(int r=0; r<countries.length;r++) {
			for(int c=0;c<countries[r].length;c++) {
				System.out.print(countries[r][c]);
				count++;
			}System.out.println();
		}System.out.println(count);
	}

}
