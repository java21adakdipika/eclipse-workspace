package com.aurionpro.model;

public class Rectangle {
	
	private double height;
	private double width;
	private Color color;
	
	public Rectangle(double height, double width, Color color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	public void setHeight(double height) {  // create
		this.height = correctionValue(height);
	}
	
	public void setWidth(double width) {
		this.width = correctionValue(width);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	private double correctionValue(double value) {
		if (value<1) {
			value = 1;
		} else if (value>100) {
			value = 100;
		} 
		return value;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double calculateArea() {
		return this.height * this.width;
	};

}
