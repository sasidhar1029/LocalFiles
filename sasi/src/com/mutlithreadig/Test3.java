package com.mutlithreadig;

class EvenOdd {
	int number = 1;

	synchronized void odd() throws InterruptedException {
		while (number <= 10) {
			if (number % 2 == 0)
				wait();
			System.out.println("odd" + number++);
			notify();
		}
	}

	synchronized void even() throws InterruptedException {
		while (number <= 10) {
			if (number % 2 == 1)
				wait();
			System.out.println("even" + number++);
			notify();
		}
	}
}

public class Test3 {

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		Thread t1 = new Thread();
		try {
			e.odd();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Thread t2 = new Thread();
		try {
			e.even();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t1.start();
		t2.start();
	}

}
