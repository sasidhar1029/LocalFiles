package com.mutlithreadig;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run" + i);
		}
	}
}

public class Test2 {

	public static void main(String[] args) {

		MyRunnable m = new MyRunnable();
		Thread t = new Thread(m);
		t.start();
	}

}
