package com.multi_threading;

public class M1 extends Thread {

	public static void main(String[] args) {
		System.out.println("Main method started");
		long start = System.currentTimeMillis();
		System.out.println(start);
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}
		welcome();
		System.out.println("Main method ended");
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("Total timen taken:" + (end - start));
	}

	static void welcome() {
		System.out.println("Welcome method started");
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}
	}
}
