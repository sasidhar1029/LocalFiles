package com.javaintro;

public class Day30 {
	int tableNumber;
	int itemsOrdered;
	double totalAmount;

	Day30() {
		System.out.println("no arg cons........");
	}

	Day30(int tableNumber) {
		this.tableNumber = tableNumber;
		this.itemsOrdered = 0;
		this.totalAmount = 0;
	}

	void method1(int items, double price) {
		itemsOrdered += items;
		totalAmount += items*price;
	}

	void method2(int percentage) {
		totalAmount += totalAmount * (percentage / 100.0);  // FIXED
	}

	void printBill() {
		System.out.println("Table number: " + tableNumber);
		System.out.println("Total items ordered: " + itemsOrdered);
		System.out.println("Total bill: " + totalAmount);
	}

	public static void main(String[] args) {
		Day30 d = new Day30();
		d.method1(3, 190);     
		d.method1(2, 270);    
		d.method2(6);          
		d.printBill();
	}
}
