package com.syntax.groupwork;

public class Task1Demo {
 public static void main(String[] args) {
	Shape circle=new Circle(12);
	Shape square= new Square(5);
	Shape [] shapes= {circle,square};
	for(Shape s:shapes) {
		s.calculateArea();
		s.calculatePerimiter();
		System.out.println("------");
	}
}
}
