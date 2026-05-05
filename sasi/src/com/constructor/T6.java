package com.constructor;

public class T6 {
	String name;
	String author;
	double price;

	public T6(String name, String author, double price) {
		this("", "");
		this.name = name;
		this.author = author;
		this.price = price;
	}

	T6(String name, String author) {
		this(200.00);
		this.name = name;
		this.author = author;
	}

	T6(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("******************");
		T6 t = new T6("sasi", "reddy", 500.00);
		t.show();
//		T6 t2 = new T6(300.00);
//		t2.show();

	}

	void show() {
		System.out.println("name:" + name);
		System.out.println("author:" + author);
		System.out.println("price:" + price);
	}

}
