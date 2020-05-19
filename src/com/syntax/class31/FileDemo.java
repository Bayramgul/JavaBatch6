package com.syntax.class31;
import java.io.*;
import java.util.Scanner;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("File.txt");//create an obj of File class to work with Files,if i specify the folder location it will create file there
		if(file.createNewFile()) {//creates a file 
			System.out.println("File created: ");
		}else {
			System.out.println("File already exists");
		}
		if(file.exists()) {
			System.out.println("File name: "+file.getName());
			System.out.println("Absolute path of the file: "+file.getAbsolutePath());
			System.out.println("Can Write: "+file.canWrite());
			System.out.println("Can Read: "+file.canRead());
			System.out.println("File length: "+file.length());
		}else {
			System.out.println("File doesn't exist");
		}
//		Scanner scan=new Scanner(file);//Use scanner to read a file
//		while(scan.hasNextLine()) {
//			String text=scan.nextLine();
//			System.out.println(text);
//		}
//		

	}

}
