package com.javaintro;

public class Vehicle19 {
	 String vehicleType;

	Vehicle19(){
		this("car");
		System.out.println("no arg constructor:");
	}
	public Vehicle19(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public static void main(String[] args) {
	}
//	void show() {
//		System.out.println(vehicleType);
//	}
}
class Car19 extends Vehicle19{
	 String vehicleType;
	 String carType;
	 String carName;
	 String brand;
	 double price;
	  Car19(String vehicleType,String carType, String carName,String brand,double price){
		this.vehicleType = vehicleType;
		 this.carType = carType;
		 this.carName =  carName;
		 this.brand = brand;
		 this.price =price;
	  }
	  Car19( ){
		  System.out.println("no arg from car");
	  }
	  public static void main(String[] args) {
		Car19 c = new Car19("car","audi","bwm","edho",2345);
		c.display();
//		c.show();
	}
	  void display() {
//		  System.out.println(vehicleType);
		  System.out.println(carType);
		  System.out.println(carName);
		  System.out.println(brand);
		  System.out.println(price);
	  }
	  }