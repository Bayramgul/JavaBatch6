package com.syntax.repl;

public class Repl115 {

	public static void main(String[] args) {
		Repl115 obj=new Repl115();
		System.out.println(obj.censorLetter("computer science",'e'));
	    System.out.println(obj.censorLetter("trick or treat",'t'));
		
	}
	String censorLetter( String word,char star){
		  String w=word.replace(star, '*');
		  return w;
		  
		}
}
