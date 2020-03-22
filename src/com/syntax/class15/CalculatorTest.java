package com.syntax.class15;

public class CalculatorTest {

	public static void main(String[] args) {
	Calculator calc	=new Calculator();
	calc.add(100,200);// this way obj can hold many values 
	calc.sub(1000,300);
	
	calc.add(123,200);
	calc.sub(245,123);
	
	calc.div(20, 10);
	calc.mult(20, 10);
	}

}
