package com.javaintro;
import java.util.Scanner;



public class Day35 {
    static double balance = 10000.0; // initial balance
    static int pin = 1234;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//     
        System.out.println("Welcome to ATM");
        System.out.println("Choose an operation: deposit / withdraw / pinchange");
        String operation = scanner.nextLine().toLowerCase();

//        switch (operation) {
//            case "deposit"->
//                depositMethod();
//                
//            case "withdraw"->
//                withdrawMethod();
//                
//            case "pinchange"->
//                pinChangeMethod();
//                
//            default ->
//                System.out.println("Invalid operation. Try again.");
//        }
        if (operation.equals("deposit")) {
            depositMethod();
        } else if (operation.equals("withdraw")) {
            withdrawMethod();
        } else if (operation.equals("pinchange")) {
            pinChangeMethod();
        } else {
            System.out.println("Invalid operation. Try again.");
        }

        System.out.println("\nThank you! Transaction details:");
        System.out.println("Final Balance: ₹" + balance);
        System.out.println("PIN (hidden for security)");
        
    }

    public static void depositMethod() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } 
        else if  (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " successfully.");}
        	else {
        }
            System.out.println("Invalid deposit amount.");
        
    }

    public static void withdrawMethod() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void pinChangeMethod() {
        System.out.print("Enter current PIN: ");
        int currentPin = scanner.nextInt();
        if (currentPin == pin) {
            System.out.print("Enter new PIN: ");
            int newPin = scanner.nextInt();

            if (newPin == pin) {
                System.out.println("New PIN cannot be the same as the old PIN.");
            } else {
                pin = newPin;
                System.out.println("PIN changed successfully.");
            }
        } else {
            System.out.println("Incorrect current PIN.");
        }
    }

}
