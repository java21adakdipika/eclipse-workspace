package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect1 = new Rectangle();
		takeRectangleValues(rect1);
		printRectangleValues(rect1);
		
		System.out.println("***********************");
		
		Rectangle rect2 = new Rectangle();
		takeRectangleValues(rect2);
		printRectangleValues(rect2);
		
		//Rectangle rectangle2 = new Rectangle();
	}
	
	private static void takeRectangleValues(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);
		double height;
		double width;
		
		System.out.print("Enter Height for rectangle1: ");
		height = sc.nextDouble();
		System.out.print("Enter Width for rectangle1: ");
		width = sc.nextDouble();
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		System.out.print("Enter a color ");
		
		try {
			rectangle.setColor(Color.valueOf(sc.next().toUpperCase()));
		}
		catch (IllegalArgumentException e) {
			rectangle.setColor(Color.RED);
		}
	}
	
	private static void printRectangleValues(Rectangle rectangle) {
		System.out.println("Height: " + rectangle.getHeight() + " Width: " + rectangle.getWidth() + " Area: " + rectangle.calculateArea());
		System.out.println("Color is " + rectangle.getColor());
		
	}
	

}
