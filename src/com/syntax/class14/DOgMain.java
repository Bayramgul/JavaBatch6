package com.syntax.class14;

public class DOgMain {

	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.color="White";
		dog1.size='L';
		dog1.age=3;
		dog1.name="Candy";
		System.out.println(" This is "+dog1.name+ " "+dog1.color+" "+dog1.size+" size "+dog1.age+" years old");
		
		Dog dog2=new Dog();
		dog2.color="yellow";
		dog2.size='m';
		dog2.age=2;
		dog2.name="Lucy";
		System.out.println(" This is "+dog2.name+ " "+dog2.color+" "+dog2.size+" size "+dog2.age+" years old");
		dog1.eat();
		dog2.bak();

	}

}
class Dog{
	
	String color;
	char size;
	int age;
	String name;
	
	void eat() {
		System.out.println(name +" can eat");
	}
	void bak() {
		System.out.println(name+ " can bark");
	}
	
	
}
