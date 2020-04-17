package com.syntax.class21;

public class StudentTest {

	public static void main(String[] args) {
System.out.println("----This is achieving runtime polymorphism");
Student st=new SyntaxStudent();
st.study();// will print overridden study in syntaxStudents
st.doHomework();
System.out.println("----Below will print inherited methods with overridden version and also its own methods ");	

CollegeStudent college=new CollegeStudent();// will print inherited methods with overridden version and also its own methods 
college.doHomework();
college.study();
college.attend();
System.out.println("-----This is achieving runtime polymorphism ");
Student school=new SchoolStudent();
school.doHomework();
school.study();

	}

}
