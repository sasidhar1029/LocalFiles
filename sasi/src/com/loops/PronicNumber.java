package com.loops;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int fact = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				if (i * (i + 1) == n)
					fact = i;
			}
		}
		if (fact != 0) {
			System.out.println("The given number is a perfect Number:" + n);
		} else {
			System.out.println("The given number not  is a perfect Number: " + n);
		}

	}

}
