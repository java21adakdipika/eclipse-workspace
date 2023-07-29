package com.aurionpro.model;

public class Accountant extends Employee{
	
	double hra;
	double ma;

	public Accountant(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		this.ma = this.basic * 0.20;
		this.hra = this.basic * 0.40;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAnnualCTC() {
		// TODO Auto-generated method stub
		double result = ((this.basic * 0.40) + (this.basic * 0.20) + basic);
		return result;
	}
	
	@Override
	public String toString() {
		return ("[Accountant]\nID: " + employeeId + "\nName: " + name + "\nBasic: " + basic + "\nMA: " + ma + "\nHRA: " + hra);
	}
	
	
}
