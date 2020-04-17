package com.syntax.class22;

public class ComputerTest {

	public static void main(String[] args) {
		Computer app=new Apple();
		Computer len=new Lenovo();
		Computer hp=new HP();
		Computer dell=new Dell();
		Computer [] comps= {app,len,hp,dell};
		for(int i=0; i<comps.length;i++) {
			comps[i].display();
			comps[i].work();
			System.out.println("-------");
		}
		// downcasting 
		// Apple computer=new Computer("Comp")
		Apple applec=(Apple)new Computer();// downcasting
	}

}
