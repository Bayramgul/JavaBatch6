package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File java= new JavaFile(); 
		File word	=new WordFile();
		File pdf=	new PDFFile();
		
		File[] files= {java,word,pdf};
		for(File f:files) {
			f.close();
			f.edit();
			f.open();
			System.out.println("-----");
		}
		
		
		}
	

}
