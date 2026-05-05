package com.TopQuestions;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count of prime numbers:" + count);
	}

	static boolean checkPrime(int n) {
		boolean status = true;
		if (n == 1) {
			status = false;
			return status;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;

			}
		}
		return true;

	}

}
