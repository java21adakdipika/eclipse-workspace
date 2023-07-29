package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		
		rectangle.height=10;
		rectangle.width=20;
		
		rectangle2.height=30;
		rectangle2.width=40;
		
		System.out.println(rectangle2.calculateArea());

	}

}
