package com.mutlithreadig;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("run" + i);
		}
	}
}

public class Test1 extends Thread {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
	}

}
