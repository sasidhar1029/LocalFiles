package com.TopQuestions;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("The given number is prime number");
		} else {
			System.out.println("The given number is not a prime numbers");
		}
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
