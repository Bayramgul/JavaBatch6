package com.syntax.class20;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		//accessing from grand parent
		emp.salary=100.00;
		emp.empNumber=1234;
		emp.getPaid();
		System.out.println("---------------");
		
		ScrumTeam scrum=new ScrumTeam();
		scrum.ceremonies="grooming, planning, daily standup, retro, demo";
		scrum.company="Amazon";
		scrum.work();
		scrum.attendMeeting();
		
		System.out.println("--------------------");
		Tester tester=new Tester();
		tester.ceremonies="daily standup";// i want to access all meetings from ScrumTeam, how?
		tester.salary=95000.00;
		tester.getPaid();
		
	}

}
