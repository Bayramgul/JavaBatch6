package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task3 {
	String StudentId;
	String name;
	Task3(String StudentId,String name){
		this.StudentId=StudentId;
	}
	public void stInfo() {
		
	}
	public String getName(String name) {
		return name;
	}

	public static void main(String[] args) {
		/*
		 * Create a Set collection that will hold Objects of Student Type. In this set
		 * we do not care about the insertion order. Each student object should have
		 * name and studentID. Display name of each student.
		 * 
		 */
		Set <Task3> student=new HashSet<>();
		student.add(new Task3("John", "111"));
		student.add(new Task3("Jane", "123"));
		student.add(new Task3("Anna","234"));
	
		
		
		Iterator st=student.iterator();
		while(st.hasNext()) {
			Object s=st.next();
		
		}
		
		
	}

}
