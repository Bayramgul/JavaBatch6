package com.syntax.class13;

public class QuizStringManipulations {

	public static void main(String[] args) {
		String c = "Hello i love java";
		  boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		  //8
		  String obj = "I LIKE JAVA";
          System.out.println(obj.charAt(3));
         
          //9
          String str = "0123456789";
          System.out.println(str.substring(4));
          //
          String word ="abrakadabra";

          String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

          System.out.println(replace);
          
          String str_Sample = "RockStar";
          System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
          String s="";
         
          System.out.println( s.isEmpty());
          
	}

}
