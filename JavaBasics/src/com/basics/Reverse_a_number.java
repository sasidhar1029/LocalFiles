package com.basics;
//Day-1
public class Reverse_a_number {
	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int n = 4567;
		System.out.println(reverse(n));
	}

}
