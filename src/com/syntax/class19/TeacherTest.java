package com.syntax.class19;

public class TeacherTest {

	public static void main(String[] args) {
			MathTeacher t1=new MathTeacher();
			t1.name="Kate";
			t1.feature="Smart";
			t1.studentNum=23;
			t1.subject="math";
			t1.workExperience=12;
			t1.displayInfo();
			t1.solve();
			System.out.println("----------------------");
			ChemistryTeacher t2=new ChemistryTeacher();
			t2.lab="laboratory";
			t2.name=" Jane";
			t2.studentNum=25;
			t2.subject="chemistry";
			t2.workExperience=2;
			t2.displayInfo();
			t2.experiment();
			System.out.println("------------------------");
			PianoTeacher t3=new PianoTeacher();
			t3.instrument="piano";
			t3.name=" Oksana";
			t3.studentNum=16;
			t3.subject="piano";
			t3.workExperience=15;
			t3.displayInfo();
			t3.teach();
	}

}
