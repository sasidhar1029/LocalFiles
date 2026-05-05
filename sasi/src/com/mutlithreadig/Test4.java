package com.mutlithreadig;

class Bank {
	int balance = 10000;

	synchronized void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println("Withdraing :" + amount);
			balance -= amount;
		} else {
			System.out.println("Insufficent Funds");
		}
		System.out.println("Remaining balance:" + balance);
	}
}

public class Test4 {

	public static void main(String[] args) {
		Bank b = new Bank();
		Thread t1 = new Thread(() -> b.withdraw(7000));
		Thread t2 = new Thread(() -> b.withdraw(4000));
		t1.start();
		t2.start();
	}

}
