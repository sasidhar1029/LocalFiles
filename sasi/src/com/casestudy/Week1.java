package com.casestudy;

import java.util.Scanner;

public class Week1 {

    static Scanner sc = new Scanner(System.in);
    static String itemName = "";
    static int price = 0, quantity = 0, discount = 0, total = 0;

    public static void main(String[] args) {
    	 System.out.println("=== Welcome to Online Food Ordering System ===");
         System.out.println("Select Food Category:");
         System.out.println("1. South Indian");
         System.out.println("2. North Indian");
         System.out.println("3. Chinese");
         System.out.print("Enter your choice (1-3): ");
         int category = sc.nextInt();

         if (category == 1) {
             southIndianMenu();
         } else if (category == 2) {
             northIndianMenu();
         } else if (category == 3) {
             chineseMenu();
         } else {
             System.out.println("Invalid category choice.");
         }
//        displayCategories();
    }



    static void southIndianMenu() {
        System.out.println("South Indian Menu:");
        System.out.println("1. Dosa - ₹50");
        System.out.println("2. Idli - ₹30");
        System.out.println("3. Vada - ₹40");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        if (choice == 1) {
          setItem("dosa",50);
        } else if (choice == 2) {
            setItem("Idli", 30);
        } else if (choice == 3) {
            setItem("Vada", 40);
        } else {
            System.out.println("Invalid item choice.");
        }
    }

    static void northIndianMenu() {
        System.out.println("North Indian Menu:");
        System.out.println("1. Roti - ₹20");
        System.out.println("2. Paneer - ₹100");
        System.out.println("3. Rajma - ₹80");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            setItem("Roti", 20);
        } else if (choice == 2) {
            setItem("Paneer", 100);
        } else if (choice == 3) {
            setItem("Rajma", 80);
        } else {
            System.out.println("Invalid item choice.");
        }
    }

    static void chineseMenu() {
        System.out.println("Chinese Menu:");
        System.out.println("1. Noodles - ₹90");
        System.out.println("2. Fried Rice - ₹100");
        System.out.println("3. Manchurian - ₹110");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            setItem("Noodles", 90);
        } else if (choice == 2) {
            setItem("Fried Rice", 100);
        } else if (choice == 3) {
            setItem("Manchurian", 110);
        } else {
            System.out.println("Invalid item choice.");
        }
    }

    static void setItem(String name, int itemPrice) {
        itemName = name;
        price = itemPrice;

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        // Nested if conditions for discount
        if (quantity >= 1) {
            if (quantity >= 3) {
                discount = 20;
            } else if (quantity == 2) {
                discount = 10;
            } else {
                discount = 0;
            }

            total = (price * quantity) - discount;
            printBill();
        } else {
            System.out.println("Invalid quantity entered.");
        }
    }

    static void printBill() {
        System.out.println("\n========= BILL =========");
        System.out.println("Selected Item : " + itemName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Discount      : ₹" + discount);
        System.out.println("Total Amount  : ₹" + total);
        System.out.println("========================");
    }
}
