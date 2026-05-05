package com.sasi;

import java.util.Scanner;

public class S31 {
	static double balance = 10000.00;
	static int pin = 1234;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("welcome to Atm");
		System.out.println("choose deposit/withdraw/pinchange");
		String operation = sc.nextLine();
		switch (operation) {
        case "deposit"->
            depositMethod();
        case "withdraw" ->
           withdrawMethod();
        case "pinchange" ->
            pinChange();
         default ->
         System.out.println("invalid operation try again");
		}
		  System.out.println("\nThank you! Transaction details:");
	        System.out.println("Final Balance: ₹" + balance);
	        System.out.println("PIN (hidden for security)");
	}
	static void depositMethod() {
		System.out.println("enter deposit amount:");
		int amount = sc.nextInt();
		if (amount > 0) {
			balance += amount;
			System.out.println("deposited :" + amount + " sucessfully");
		} else {
			System.out.println("invalid amount entered");
		}
	}

	static void withdrawMethod() {
		System.out.println("Entera withdraw amount");
		int amount = sc.nextInt();
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw " + amount + "sucessfully");
		} else {
			System.out.println("insufficent amount");
		}
	}

	static void pinChange() {
		System.out.println("enter current pin");
		int currentPin = sc.nextInt();
		if (currentPin == pin) {
			System.out.println("enter new pin");
			int newPin = sc.nextInt();
			if (newPin == pin) {
				System.out.println("we cant give same pin as old pin");
			} else {
				System.out.println("pin change successfully");
			}
		}
	}

}
