package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMovable[] movables = {
				new Car("AR-124", LocalDate.of(2023, 7, 9)),
				new Bike("BK-161", LocalDate.of(2022, 11, 4)),
				new Bus("ICR", LocalDate.of(2020, 8, 22)),	
		};
		
		for (IMovable x: movables) {
			startMoving(x);
		}

	}
	
	public static void startMoving(IMovable y) {
		System.out.println(y);
		Vehicle obj = (Vehicle)y;
		obj.showToSpeed();
		y.move();
		System.out.println("**********************************************");
		
	}

}
