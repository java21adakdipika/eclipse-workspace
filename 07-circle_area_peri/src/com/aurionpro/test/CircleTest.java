package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Border;
import com.aurionpro.model.Circle;


public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		
		circle.setRadius(5);
		
		circle.setColor(Color.BLUE);
		circle.setBorder(Border.dotted);
		
		System.out.println("Radius: " + circle.getRadius() + " Color: " + circle.getColor() + " Border: " + circle.getBorder());
		System.out.println("Area is " + circle.calculateArea());
		System.out.println("Perimeter is " + circle.calculatePerimeter());
	}

}
