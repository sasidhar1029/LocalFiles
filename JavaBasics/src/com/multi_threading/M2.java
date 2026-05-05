package com.multi_threading;

public class M2 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started");
		long start = System.currentTimeMillis();
		M2 m = new M2();
		m.run();
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("main method ended");
		long end = System.currentTimeMillis();
		System.out.println("Total Time taken:" + (end - start));
	}

	@Override
	public void run() {
		System.out.println("Welcome method started");
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Welcome method ended");
	}
}
