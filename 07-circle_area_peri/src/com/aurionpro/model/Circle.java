package com.aurionpro.model;

public class Circle {
	
	private double radius;
	private Border border;
	private Color color;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setBorder(Border border) {
		this.border = border;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public Border getBorder(){
		return this.border;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double calculateArea() {
		return this.radius * this.radius * 3.14;
	};
	
	public double calculatePerimeter() {
		return this.radius * 3.14 *2;
	};

}
