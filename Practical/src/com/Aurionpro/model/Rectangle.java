package com.Aurionpro.model;

public class Rectangle {
	
	private double height;
	private double width;
	private String color;
	
	public void setHeight(double height) {
		this.height = correctionValues(height);
	}
	
	public void setWidth(double width) {
		this.width = correctionValues(width);
	}

	public void setColor(String color) {
		if (color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green")) {
			this.color = color;
		} else {
			this.color = "RED";
		}
	}
	
	private double correctionValues(double parameter) {
		if (parameter > 100) {
			parameter = 100;
		} else if (parameter < 1){
			parameter = 1;
		} 
		
		return parameter;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double calculateArea() {
		return this.height * this.width;
	}

}
