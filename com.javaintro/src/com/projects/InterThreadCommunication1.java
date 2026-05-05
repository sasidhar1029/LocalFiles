package com.projects;

class Resource {
	int i;
	boolean status = false;

	void put(int i) throws InterruptedException {
		if (status) {
			wait();
		}
		this.i = i;
		System.out.println("put:" + i);
		status = true;
	}

	void get() throws InterruptedException {
		if (!status) {
			wait();
		}
		System.out.println("get:" + i);
	}
}

public class InterThreadCommunication1 {

	public static void main(String[] args) {

	}

}
