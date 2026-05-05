package com.practice;

public class Class {
        public static void main(String[] args) {
			Car c1 = new Car("toyoto",40);
//			System.out.println(c1.brand);
			c1.display();
			Car c2 = new Car("volvo",50);
			c2.display();
		}
	}



class Car {
	String brand;
	int speed;
    Car(String brand,int speed){
    	this.brand=brand;
    	this.speed=speed;
    }
	void display() {
		System.out.println("brand:" + brand);
		System.out.println("speed:" + speed);
		System.out.println("***************");
	}
}
