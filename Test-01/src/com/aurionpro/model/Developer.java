package com.aurionpro.model;

public class Developer extends Employee{
	
	double pa; 
	double ot;

	public Developer(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		this.pa = this.basic * 0.40;
		this.ot = this.basic * 0.20;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAnnualCTC() {
		// TODO Auto-generated method stub
		double result = (pa + ot + basic);
		return result;
	}

	@Override
	public String toString() {
		return ("[Developer]\nID: " + employeeId + "\nName: " + name + "\nBasic: " + basic + "\nPA: " + pa + "\nOT: " + ot);
	}
	
}
