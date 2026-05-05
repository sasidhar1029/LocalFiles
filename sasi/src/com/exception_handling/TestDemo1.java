package com.exception_handling;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int a =sc.nextInt();
			System.out.println("Enter b number");
			int b =sc.nextInt();
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.err.println("In catch");
		}

		System.out.println("main method ended");
	}

}
