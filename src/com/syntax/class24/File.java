package com.syntax.class24;
/*Create a class File that will have the following behaviors: open, edit, close. 
 * Edit and close are implemented method while open is an abstract. Create 3 subclasses: 
 * JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
 * Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
 * 
 */

public abstract class File {
	void edit() {
System.out.println("We can edit files");
	}

	void close() {
  System.out.println("We can close files");
	}

	abstract void open();
}

class JavaFile extends File {

	@Override
	void open() {
		System.out.println("To open .java file we need notepad");
	}}

	class WordFile extends File {

		@Override
		void open() {
			System.out.println("To doc. file  Microsoft Word needs to be installed");
		}}

		class PDFFile extends File {

			@Override
			void open() {
				System.out.println("To open .pdf file we need PDF installed");
			}

		
	
}