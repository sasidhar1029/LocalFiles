package com.javaintro;

import java.util.Scanner;

public class Day37 {
	
	String cName;
	long number;
	String coName;
	double price;
	int quantity;
	double totalBill;

	void cDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the customer name");
		 cName = sc.nextLine();
		System.out.println("Enter a customer number");
		 number = sc.nextLong();
	}

	void coDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.println("coffee name:");
		 coName = sc.nextLine();
		System.out.println("coffee price");
		 price = sc.nextDouble();
		System.out.println("quantity");
		 quantity = sc.nextInt();
	}

	void calBill() {
  totalBill = price * quantity;
	}

	void Pbill() {
		System.out.println(cName);
		System.out.println(number);
		System.out.println(coName);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(totalBill);

	}

	public static void main(String[] args) {
		Day37 d = new Day37();
		d.cDetails();
		d.coDetails();
		d.calBill();
		d.Pbill();

	}

}