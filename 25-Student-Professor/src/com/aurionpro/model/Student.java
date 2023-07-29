package com.aurionpro.model;

import java.util.Date;
import java.time.LocalDate;

public class Student extends Person{
	
	String branch;

	public Student(int id, String address, LocalDate dob, String branch) {
		super(id, address, dob);
		this.branch = branch;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
//		return "Student [branch=" + branch + "]";
		return "Student [id=" + id + ", address=" + address + ", dob=" + dob + ", branch=" + branch + "]";
	}
	
	

}
