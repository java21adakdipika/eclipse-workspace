package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(60, 40);
		
//		rectangle.setHeight(1002);
//		rectangle.setWidth(30);
		
		System.out.print("Enter a color ");
		Scanner sc = new Scanner(System.in);
		
		String color = sc.next();
		rectangle.setColor(color);
		
		System.out.println("Height: " + rectangle.getHeight() + " Width: " + rectangle.getWidth() + " Area: " + rectangle.calculateArea());
		System.out.println("Color is " + rectangle.getColor());
	}

}
