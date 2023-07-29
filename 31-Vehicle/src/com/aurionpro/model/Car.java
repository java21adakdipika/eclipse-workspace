package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable{
	

	public Car(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving");
		
	}

	@Override
	public void showToSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Car is 150km/hr");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", dom=" + dom + "]";
	}
	
	

}
