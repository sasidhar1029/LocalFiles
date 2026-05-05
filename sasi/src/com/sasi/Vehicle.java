package com.sasi;

public class Vehicle {
    int vehicleNumber;
    String brand;
    double basePrice;

    Vehicle() {
        System.out.println("No-arg constructor called");
    }

    Vehicle(int vehicleNumber, String brand, double basePrice) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    

    // Make Car a static class
    static class Car extends Vehicle {
        int noOfSeats;

        Car(int noOfSeats, int vehicleNumber, String brand, double basePrice) {
            super(vehicleNumber, brand, basePrice);
            this.noOfSeats = noOfSeats;
        }

        void method() {
            System.out.println(vehicleNumber);
            System.out.println(brand);
            System.out.println(basePrice);
            System.out.println(noOfSeats);
        }

        public static void main(String[] args) {
            Car c = new Car(5, 1029, "Audi", 10000.00);
            c.method();
        }
    }
}
