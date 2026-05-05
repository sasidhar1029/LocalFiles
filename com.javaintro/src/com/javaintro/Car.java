package com.javaintro;

public class Car {
	String model ;
	String brand ;
	int year ;
	int price;


	
	  Car(String model,String brand,int year,int price ){
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.price = price;
		
	}
	public static void main(String[] args) {
		Car c1=new Car("audi","Bmw",2025,300000);
		System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c1.year);
		System.out.println(c1.price);

	}

}