package com.aurionpro.model;

import java.util.Date;
import java.time.LocalDate;

public abstract class Person {
	
	protected int id;
	protected String address;
	protected LocalDate dob;
	
	public Person(int id, String address, LocalDate dob) {
		super();
		this.id = id;
		this.address = address;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", dob=" + dob + "]";
	}
	
	
	
	
	

}
