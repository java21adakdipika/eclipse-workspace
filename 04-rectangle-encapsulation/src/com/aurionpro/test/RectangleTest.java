package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		
		rectangle.setHeight(90);
		rectangle.setWidth(30);
		
//		System.out.println(rectangle.getWidth());
		
		
		System.out.println("Height: " + rectangle.getHeight() + " Width: " + rectangle.getWidth() + " Area: " + rectangle.calculateArea());

	}

}
