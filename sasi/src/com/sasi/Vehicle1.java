package com.sasi;

public class Vehicle1 {
   String name;
	String brand;
	double price;
	public Vehicle1(String name, String brand, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
   public static void main(String[] args) {
	System.out.println("main method called from vehicle:");
}
   
}
class Bike extends Vehicle1{

	public Bike(String name, String brand, double price) {
		super(name, brand, price);
	}
	public static void main(String[] args) {
		System.out.println("main method called from bike ");
		Bike b1 = new Bike("duke", "ktm", 200000);
		System.out.println(b1.name);
		System.out.println(b1.brand);
		System.out.println(b1.price);
	}
	
}
