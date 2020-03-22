package Repl;

public class Repl101 {

	public static void main(String[] args) {
		
		Main object = new Main();
		object.name = "John";
		object.roll_no = 2;
		System.out.println("Name is " + object.name + " and roll number is " + object.roll_no);
	}
}

class Main {
	String name;
	int roll_no;

}
