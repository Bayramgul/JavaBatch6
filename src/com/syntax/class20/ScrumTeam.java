package com.syntax.class20;

public class ScrumTeam extends Employee {

	String ceremonies;

	void attendMeeting() {
		System.out.println("Scrum team is attending " + ceremonies);
	}
}
class ProductOwner extends ScrumTeam {
	void prioritizeBacklog() {
		System.out.println(" Product owner prioritizes backlog");
	}
}

class ScrumMaster extends ScrumTeam {
	void navigateTeam() {
		System.out.println("Scrum Master fasilitates the project process");
	}
}
class Developer extends ScrumTeam {
	void coding() {
		System.out.println("Developers are coding");
	}
}
class Tester extends ScrumTeam{
	void testing() {
		System.out.println("Testers are testing");
	}
}
class BussinessAnalyst extends ScrumTeam{
	void workWithRequirements() {
		System.out.println("Bussiness Analyst is working with requirements");
	}
	
}