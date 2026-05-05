package com.loops;

import java.util.Scanner;

public class DeficientNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum <n) {
			System.out.println("The given number is a Deficient Number:" + n);
		} else {
			System.out.println("The given number not  is a Deficient Number: " + n);
		}

	}

}
