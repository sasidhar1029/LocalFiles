package com.javaintro;

public class NewClass {

	static void Welcome() {
		System.out.println("Welcome to hyd");
		System.out.println("welcome to rayadurg");
		System.out.println("Welcome to manikonda");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		System.out.println("main method ended");
		Welcome();
		NewClass t1 = new NewClass();
		t1.hello();
	}

	void hello() {
		System.out.println("good evening guys!");
	}

}
