package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable{
	

	public Bike(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bike is moving");
		
	}

	@Override
	public void showToSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Bike is 120km/hr");
	}
	
	@Override
	public String toString() {
		return "Bike [model=" + model + ", dom=" + dom + "]";
	}

}
