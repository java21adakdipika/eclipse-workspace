package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable{
	

	public Bus(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bus is moving");
		
	}

	@Override
	public void showToSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Bus is 80km/hr");
	}
	
	@Override
	public String toString() {
		return "Bus [model=" + model + ", dom=" + dom + "]";
	}

}
