package com.Aurionpro.test;

import java.util.Scanner;

import com.Aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
//		Rectangle rect1 = new Rectangle();
//		takeValues(rect1);
//		printValues(rect1);
		
		Rectangle[] rectangles = new Rectangle[3];
		for (int i=0;i<rectangles.length;i++) {
			rectangles[i] = new Rectangle();
			takeValues(rectangles[i]);
			printValues(rectangles[i]);
			System.out.println("****************************");
		}
	}
	
	public static void takeValues(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Height: ");
		double height = sc.nextDouble();
		System.out.print("Enter Width: ");
		double width = sc.nextDouble();
		System.out.print("Enter Color: ");
		String color = sc.next();
		
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		rectangle.setColor(color);
	}
	
	public static void printValues(Rectangle rectangle) {
		System.out.println("Height is " + rectangle.getHeight() + " and Width is " + rectangle.getWidth());
		System.out.println("Area is " + rectangle.calculateArea());
		System.out.println("Color is " + rectangle.getColor());
	}
	
}
