package com.practice;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		P2 p = new P2();
		p.add(10, 12);
		p.sub(10, 99);
		p.mul(2, 8);
		p.div(10, 3);
		p.mul(10, 40);
	}

	void add(int a, int b) {
		System.out.println("Addition:" + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}

	void mul(int a, int b) {
		System.out.println("Multiplication:" + (a * b));
	}

	void div(int a, int b) {
		System.out.println("Division:" + (a / b));
	}

	void mod(int a, int b) {
		System.out.println("Modulus" + (a % b));
	}

}
