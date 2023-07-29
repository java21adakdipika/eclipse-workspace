package com.aurionpro.model;

public class Rectangle {
	
	private double height;
	private double width;
	private String color;
	private int number; // null // this.number
	
	
	public void setHeight(double heigt) {
		this.height = correctionValue(heigt);
	}
	
	public void setWidth(double width) {
		this.width = correctionValue(width);
	}
	
	public void setColor(String color) {
		if (color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("red")) {
			this.color = color;
		}
		else {
			this.color = "red";
		}
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
		return this.width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double calculateArea() {
		return this.height * this.width;
	};

}
