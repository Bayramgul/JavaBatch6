package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		String me="I am a good tester";
		
		String newS=me.replace("a", "c");
			System.out.println(newS);
			
			me=me.replace("good", "awesome");
			System.out.println(me);
			
			//replaces single character
			String car="I have a Toyota";
			car=car.replace("Toyota","Lexus");
			System.out.println(car);
			
			String str="Phone number 1234567890";
			//replace all capital letters with ""
			str=str.replaceAll("[A-Z]"," ");
			System.out.println(str);
			//replace all letters with ""
			str=str.replaceAll("[A-Za-z]"," ");
			System.out.println(str);
			
			String str1="Hello123454**4$$&&";
			//replaces all numbers
			str1=str1.replaceAll("[0-9]", "");
			
			System.out.println("str1 is without numbers "+ str1);
			str1=str1.replaceAll("[^A-Za-z]","");//replaces any character other than letter
			System.out.println(" numbers and special characters   "+ str1);
			
			str1=str1.replaceAll("[^A-Za-z0-9]", "");
			System.out.println("without any special charcaters    "+str1);
	}

}
