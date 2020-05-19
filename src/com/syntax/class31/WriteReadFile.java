package com.syntax.class31;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteReadFile {

	public static void main(String[] args) throws IOException {
		FileWriter file1= new FileWriter("File.txt");
		file1.write("Java is a programming language");// writes to a file
		file1.close();
		System.out.println("Successfully written to the file");
		File myFile=new File("/Users/Bayramgul/eclipse-workspace/JavaBasics/File.txt");// create object of File class to use the read method of Scanner Class
		Scanner scan=new Scanner(myFile);//Use scanner to read a file
		while(scan.hasNextLine()) {
			String text=scan.nextLine();
			System.out.println(text);
		}
		file1.close();
	}

}
