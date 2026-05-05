package com.loops;
//Print Prime Numbers in a Given Range
public class P19 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (checkPrime(i)) {
				
				System.out.print(i+" ");
			}
		}
	}

	static boolean checkPrime(int n) {
		boolean status = true;
		if (n == 1) {
			status = false;
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}