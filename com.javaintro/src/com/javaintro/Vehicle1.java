package com.javaintro;

// Not public since file name is Vehicle1.java
 public class Vehicle1 {
    String type;

    Vehicle1() {
        System.out.println("Vehicle1: no-arg constructor");
    }

    Vehicle1(String type) {
        this.type = type;
        System.out.println("Vehicle1: parameterized constructor");
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        Ecar1 e1 = new Ecar1("4wheeler", "Audi", 40000);
        e1.display();
    }
}

class Car1 extends Vehicle1 {
    String brand;

    Car1() {
        System.out.println("Car1: no-arg constructor");
    }

    Car1(String type, String brand) {
        super(type);
        this.brand = brand;
        System.out.println("Car1: parameterized constructor");
    }
}

 class Ecar1 extends Car1 {  // This is now the public class and must match filename: Ecar.java if used standalone
    int batteryCapacity;

    Ecar1() {
        System.out.println("Ecar: no-arg constructor");
    }

    Ecar1(String type, String brand, int batteryCapacity) {
        super(type, brand);
        this.batteryCapacity = batteryCapacity;
        System.out.println("Ecar: parameterized constructor");
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Battery Capacity: " + batteryCapacity);
    }

  
}
