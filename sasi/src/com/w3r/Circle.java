package com.w3r;

public class Circle extends Dummy {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {

		return Math.PI * radius * radius;

	}

	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

}
