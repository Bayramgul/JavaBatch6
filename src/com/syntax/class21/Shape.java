package com.syntax.class21;

public class Shape {
	// Write program: Shape class has a constructor that takes the radius and has a
	// subclass as circle class. In circle class create a method to calculate the
	// area of circle. Test your code
	
	 int r;

	Shape(int r){
		this.r=r;
	}

}
  class Circle extends Shape {
	  double p;
	Circle(int r,double p){
		super(r);
		this.p=p;
		
		
	}
	public void area() {
		double area=r*r*p;
		System.out.println(area);
	
	}
	  
}
