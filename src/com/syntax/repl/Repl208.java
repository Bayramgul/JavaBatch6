package com.syntax.repl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repl208 {
	/*
	 * Create a method that will not be handling exception and throwing it at caller.
In main method call method and handle the exception.

Expected Output:
java.io.FileNotFoundException:  (No such file or directory)
	 */
public static void exception (String filePAth)throws FileNotFoundException {
	FileInputStream fis= new FileInputStream(filePAth);
}
	public static void main(String[] args) {
		try {
			exception("");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
