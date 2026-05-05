package com.console_based_projects;


import java.util.Scanner;

public class Atm {
    private double balance;
    private int pin;

    public Atm(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // method to check PIN
    public boolean checkPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // method to check balance
    public void checkBalance() {
        System.out.println("Your current balance: ₹" + balance);
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn ₹" + amount);
            checkBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Atm atm = new Atm(5000, 2468); // initial balance ₹5000, PIN = 1234
        System.out.println("==== Welcome to ATM ====");

        // PIN verification
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (!atm.checkPin(enteredPin)) {
            System.out.println("Incorrect PIN! Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\n---- ATM Menu ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

