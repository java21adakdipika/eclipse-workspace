package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class AccountantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager(101, "Dipika", 2000);
		printSalary(manager);
		
		Developer developer = new Developer(102, "Vedika", 5000);
		printSalary(developer);
		
		Accountant accountant = new Accountant(103, "Niharika", 4000);
		printSalary(accountant);

	}
	
	public static void printSalary(Employee employee) {
		System.out.println(employee);
		System.out.println("Annual Salary: " + employee.calculateAnnualCTC() + "\n");
	}

}
