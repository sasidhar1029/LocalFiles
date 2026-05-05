package com.w3r;

public class Triangle extends Dummy{
	private double side1;
	private double side2;
	private double side3;


	@Override
	public double calculatePerimeter() {
		 
		return side1+side2+side3;
		
	}

}
