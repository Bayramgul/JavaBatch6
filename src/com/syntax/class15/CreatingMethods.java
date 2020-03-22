package com.syntax.class15;

public class CreatingMethods {
	public static void main(String[] args) {
		CreatingMethods obj=new CreatingMethods();
		//we want to create a method that will accept marks(90, 80)
		// based on the marks it will return grade(A, B, C)
		// if grade > 90--> A, if 90<grade>80 --> B, if 80<grade>70 --> C
		char marks=obj.grade(85);// storing returning mark
		System.out.println(marks);
		
	}

	char grade(int a){
		char mark;
		
		if (a>90) {
			mark='A';
		}else if (a>80 && a<90) {
			mark='B';
		}else if(a>70&& a<80) {
			mark='C';
		}else {
			mark ='D';
		}
		return mark;
	}
}
