package com.aurionpro.model;

import java.util.Date;
import java.time.LocalDate;

public class Professor extends Person implements SalariedEmployee{
	
	double salary;

	public Professor(int id, String address, LocalDate dob, double salary) {
		super(id, address, dob);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		double finalsalary = salary * 25 /3;
		return finalsalary;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", address=" + address + ", dob=" + dob + ", salary=" +  salary + "]";
	}
	
	
}
