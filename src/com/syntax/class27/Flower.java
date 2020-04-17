package com.syntax.class27;

abstract public class Flower {
	public String type;
	public Flower(String type) {
		this.type=type;
	}
	abstract void bloom() ;
	
// define flower class that will have String type, constructor that initializes a variables and undefine method
		
		
	
}
class Tulip extends Flower{

	public Tulip(String type) {
		super(type);
	}

	@Override
	void bloom() {
		System.out.println(type+ " blooms in March");
	}
	
}
class Rose extends Flower{

	public Rose(String type) {
		super(type);
	}

	@Override
	void bloom() {
		System.out.println(type+ "blooms in May");
	}
	
}
class Sunflower extends Flower{

	public Sunflower(String type) {
		super(type);
	}

	@Override
	void bloom() {
		System.out.println(type+ "blooms in August");
	}
	
}