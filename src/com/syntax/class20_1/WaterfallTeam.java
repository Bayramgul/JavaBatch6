package com.syntax.class20_1;

import com.syntax.class20.Employee;// we need to import from different package

public class WaterfallTeam extends Employee{

	public static void main(String[] args) {
		WaterfallTeam wteam= new WaterfallTeam();
		wteam.company="Syntax";
		//wteam.salary;-->default members are  not accessible by inheritance
		//wteam.ssn;-->salary is private and is not accessible by inheritance
	wteam.empNumber=124;//protected variable is visible
	}

}
